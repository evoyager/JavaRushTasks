package com.javarush.task.task30.task3008.client;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.javarush.task.task30.task3008.ConsoleHelper;

public class BotClient extends Client {

    public static void main(String[] args) {
        BotClient bot = new BotClient();
        bot.run();
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            BotClient.this.sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            String name, incomeMessage;
            String[] messageSplit = message.split(": ");
            if (messageSplit.length >= 2) {
                name = messageSplit[0];
                incomeMessage = messageSplit[1];
                Calendar cal = new GregorianCalendar();
                Date date = cal.getTime();
                SimpleDateFormat sdf;
                String responseMsg, dateMsg = "";
                switch (incomeMessage) {
                    case "дата": {
                        sdf = new SimpleDateFormat("d.MM.YYYY");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    case "день": {
                        sdf = new SimpleDateFormat("d");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    case "месяц": {
                        sdf = new SimpleDateFormat("MMMM");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    case "год": {
                        sdf = new SimpleDateFormat("YYYY");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    case "время": {
                        sdf = new SimpleDateFormat("H:mm:ss");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    case "час": {
                        sdf = new SimpleDateFormat("H");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    case "минуты": {
                        sdf = new SimpleDateFormat("m");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    case "секунды": {
                        sdf = new SimpleDateFormat("s");
                        dateMsg = sdf.format(date);
                        break;
                    }
                    default: return;
                }
                responseMsg = String.format("Информация для %s: %s", name, dateMsg);
                BotClient.this.sendTextMessage(responseMsg);
            }
        }
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return String.format("date_bot_%d", (int)(Math.random() * 100));
    }
}
