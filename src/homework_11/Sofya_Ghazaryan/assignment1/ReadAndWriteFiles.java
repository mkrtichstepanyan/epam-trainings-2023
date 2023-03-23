package homework_11.Sofya_Ghazaryan.assignment1;

import java.io.*;

public class ReadAndWriteFiles {

    public static String readFile(String fileName) {

        File file = new File(fileName);

        String readLine = null;
        StringBuilder builder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if (fileName.endsWith(".txt") || fileName.endsWith(".cvs") || fileName.endsWith(".json")) {
                do {
                    readLine = bufferedReader.readLine();
                    builder.append(readLine).append("\n");
                } while (readLine != null);
            } else {
                System.err.println("Unsupported file format!!!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }

    public static void writeFile(String fileName, String date) {
        File file = new File(fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".cvs") || fileName.endsWith(".json")) {
                bufferedWriter.write(date);
            } else {
                System.err.println("Unsupported file format!!!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String processData(String data) {
        String fileName = "C:\\Users\\Hp\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\test.txt";
        String dataUppercase = data.toUpperCase();
        writeFile(fileName, dataUppercase);
        return dataUppercase;
    }
}
