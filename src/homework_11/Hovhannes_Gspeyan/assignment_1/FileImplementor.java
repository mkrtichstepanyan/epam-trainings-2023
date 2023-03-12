package homework_11.Hovhannes_Gspeyan.assignment_1;

import java.io.*;
public class FileImplementor {
    public static String readFile(String fileName) {
        String lineContent;
        StringBuilder fullContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")){
                while ((lineContent = reader.readLine()) != null) {
                    fullContent.append(lineContent).append("\n");
                }
            }else {
                System.out.println("unsupported file format! ");
                return null;
            }
        } catch (IOException e) {
            System.out.println(fileName + " does not exist");
            return null;
        }
        return fullContent.toString();
    }

    public static void writeFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
                writer.write(data);
            } else {
                System.out.println("unsupported file format! ");
                return;
            }
        } catch (IOException e) {
            System.out.println(fileName + " does not exist");
        }
        System.out.println(data);
    }


    public static String processData(String data) {
        writeFile("C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\" +
                "src\\homework_11\\Hovhannes_Gspeyan\\modifiedData.txt", data.toUpperCase());
        return data;
    }
}
