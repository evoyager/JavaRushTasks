package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        try {
            file = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties props = new Properties();
        if (!properties.isEmpty()) {
//            PrintWriter pw = new PrintWriter(outputStream);
            for (Map.Entry<String, String> property : properties.entrySet()) {
                String key = property.getKey();
                String value = property.getValue();
                if (!key.isEmpty() && !value.isEmpty()) {
//                    pw.println(key);
//                    pw.flush();
                    props.put(key, value);
                }
//                if (!value.isEmpty()) {
//                    pw.println(value);
//                    pw.flush();
//                }
            }
            props.store(outputStream, "PropertiesDemo");
        }
    }

    public void load(InputStream inputStream) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        Properties props = new Properties();
        props.load(inputStream);
        Enumeration<String> enums = (Enumeration<String>) props.propertyNames();
        while (enums.hasMoreElements()) {
            String key = enums.nextElement();
            String value = props.getProperty(key);
            properties.put(key, value);
        }
//        while (br.ready()) {
//            String key = br.readLine();
//            String value = br.readLine();
//            properties.put(key, value);
//        }
    }

    public static void main(String[] args) {
        try {
            File your_file_name = new File("zz.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            String key1 = "salary";
            String value1 = "$3000";
            properties.put(key1, value1);
            String key2 = "job";
            String value2 = "developer";
            properties.put(key2, value2);
            Solution solution = new Solution();
            solution.save(outputStream);
            outputStream.flush();
            outputStream.close();
            Map<String, String> propertiesCopy = new HashMap<>();
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                propertiesCopy.put(entry.getKey(), entry.getValue());
            }

            properties.clear();

            solution.load(inputStream);
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                System.out.println(propertiesCopy.containsKey(entry.getKey()));
                System.out.println(propertiesCopy.get(entry.getKey()).equals(entry.getValue()));
            }
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }

    }
}
