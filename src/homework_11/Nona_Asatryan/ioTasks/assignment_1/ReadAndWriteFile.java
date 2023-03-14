package homework_11.Nona_Asatryan.ioTasks.assignment_1;

import java.io.*;

public class ReadAndWriteFile {
    public static String readFile(String fileName) {
        String line;
        StringBuilder file = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".json") || fileName.endsWith(".csv")){
                while ((line = reader.readLine()) != null) {
                    file.append(line).append("\n");
                }
            }else {
                System.out.println("unsupported file format! ");
                return null;
            }
        } catch (IOException e) {
            System.out.println(fileName + " doesn't exist");
            return null;
        }
        return file.toString();
    }

    public static void writeFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".json") || fileName.endsWith(".csv")) {
                writer.write(data);
            } else {
                System.out.println("unsupported file format! ");
                return;
            }
        } catch (IOException e) {
            System.out.println(fileName + " doesn't exist");
        }
        System.out.println(data);
    }


    public static String processData(String data) {
        writeFile("/Users/nona.asatryan/epam-trainings-2023/src/homework_11/Nona_Asatryan/" +
                "ioTasks/assignment_1/file.txt", data.toUpperCase());
        return data;
    }
}
