package homework_11.Vladimir_Vanyan;

import java.io.*;

public class FileReadAndWrite {
    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static String readFile(String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            StringBuilder result = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String data;
                while ((data = reader.readLine()) != null) {
                    result.append("\n");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File dosn't exist ");
            } catch (IOException e) {
                System.err.println("Cant read file");
                e.printStackTrace();
            }
        }
        return fileName;
    }

    public static String writeFile(String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(data);
            } catch (IOException e) {
                System.out.println("Can't write file");
            }
        }
        return fileName;
    }
}
