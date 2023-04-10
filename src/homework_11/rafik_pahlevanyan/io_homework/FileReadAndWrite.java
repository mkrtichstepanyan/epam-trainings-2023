package homework_11.rafik_pahlevanyan.io_homework;

import java.io.*;

public class FileReadAndWrite {
    public static void write(String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                bw.write(data);
            } catch (IOException e) {
                System.out.println("Error!!!Can not write into file");
                System.exit(1);
            }
        } else {
            System.err.println("Wrong data Format");
            System.exit(1);
        }
    }

    public static String read(String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            StringBuilder result = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    result.append(line).append("\n");
                }
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
                System.exit(1);
            } catch (IOException e) {
                System.err.println("Error!!Can`t read file");
                System.exit(1);
            }
            return result.toString();
        } else {
            return "Wrong Format";
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
}
