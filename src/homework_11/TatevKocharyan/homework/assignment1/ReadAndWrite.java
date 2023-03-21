package homework_11.TatevKocharyan.homework.assignment1;

import java.io.*;

public class ReadAndWrite {

    public static String readFile(String fileName) {

        File file = new File(fileName);
        String readLine = null;
        StringBuilder builder = new StringBuilder();
        try (FileReader filereader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(filereader);
            if (fileName.endsWith(".txt") || fileName.endsWith(".cvs") || fileName.endsWith(".json")) {
                do {
                    readLine = bufferedReader.readLine();
                    builder.append(readLine).append("\n");
                } while (readLine != null);
            } else {
                System.out.println("unsupported file format");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            e.getMessage();
        }
        return builder.toString();
    }

    public static void writeFile(String fileName, String data) {
        File file = new File(fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".cvs") || fileName.endsWith(".json")) {
                bufferedWriter.write(data);
            } else {
                System.out.println("unsupported file format");
            }

        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static String processData(String data) {
        String fileName = "C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\text.txt";
        String dataUppercase = data.toUpperCase();
        writeFile(fileName, dataUppercase);

        return dataUppercase;
    }
}