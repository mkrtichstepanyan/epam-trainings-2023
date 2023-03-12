package homework_11.araksya_ghazaryan;

import java.io.*;

public class FileDemo {
    public static String readFile (String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            StringBuilder result = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String data;
                while ((data = reader.readLine()) != null) {
                    result.append(data).append("\n");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: %s ");
            } catch (IOException e) {
                System.err.println("Error!!Can`t read file");
                e.printStackTrace();
            }
        }
        return fileName;
    }

    public static String writeFile (String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(data);
            } catch (IOException e) {
                System.out.println("Error!!!Can`t write into file");
            }
        }
        return fileName;
    }
    public static String processData(String data){
        return data.toUpperCase();
    }
}
