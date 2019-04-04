package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера: ");
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("Server started...");
            while (true) {
//                Socket socket = serverSocket.accept();
//                Handler handler = new Handler(socket);
//                handler.start();
                new Handler(serverSocket.accept()).start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Something wrong, server socket closed.");
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            SocketAddress address = socket.getRemoteSocketAddress();
            if (socket != null && socket.getRemoteSocketAddress() != null) {
                ConsoleHelper.writeMessage("Connection established to remote socket address: " + address);
            }
            try (Connection connection = new Connection(socket)) {
                socket.connect(address);
                String name = serverHandshake(connection);
                Message message = new Message(MessageType.USER_ADDED, name);
                sendBroadcastMessage(message);
                notifyUsers(connection, name);
                serverMainLoop(connection, name);
                connectionMap.remove(name);
                message = new Message(MessageType.USER_REMOVED, name);
                sendBroadcastMessage(message);
                ConsoleHelper.writeMessage("Connection closed with remote address");
            } catch (IOException e) {
                ConsoleHelper.writeMessage("IOException occurs during data exchange with remote address");
            } catch (ClassNotFoundException e) {
                ConsoleHelper.writeMessage("ClassNotFoundException occurs during data exchange with remote address");
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message response = connection.receive();
                if (!response.getType().equals(MessageType.USER_NAME)) {
                    continue;
                }
                String name = response.getData();
                if (name != null && !name.equals("")) {
                    if (!connectionMap.containsKey(name)) {
                        connectionMap.put(name, connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        ConsoleHelper.writeMessage(String.format("%s принято", name));
                        return name;
                    }
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (Entry<String, Connection> entry : connectionMap.entrySet()) {
                String name = entry.getKey();
                if (!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException {
            while (true) {
                try {
                    Message message = connection.receive();
                    if (message.getType()==MessageType.TEXT) {
                        String messageStr = String.format("%s: %s", userName, message.getData());
                        Message newMessage = new Message(MessageType.TEXT, messageStr);
                        sendBroadcastMessage(newMessage);
                    } else {
                        ConsoleHelper.writeMessage("Message isn't TEXT");
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void sendBroadcastMessage(Message message) {
        for (Entry<String, Connection> entry : connectionMap.entrySet()) {
            try {
                entry.getValue().send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Message sending failed.");
            }
        }
    }
}
