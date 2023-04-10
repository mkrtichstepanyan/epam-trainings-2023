package homework_11.Nelli_Poghosyan.Assignment_1;

import java.io.*;

public class FileReaderWriter {
    public String ReadFile(String fileName) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".json") || fileName.endsWith(".csv")) {
                String text;
                StringBuilder file = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                    while ((text = bufferedReader.readLine()) != null) {
                        file.append(text).append("\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("The file doesn't exist.");
                }
                return file.toString();

            } else {
                System.out.println("The file extension doesn't supported");
                return "";
            }
    }

    public String processData(String text) {
        if(text != null) {
          String upperCaseString = text.toUpperCase();
            return upperCaseString;
        }
        return "";
    }

    public void writeFile(String fileNameWrite, String filenameRead) {
        String text = null;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameWrite))) {
            writer.append(" ");
            writer.append(processData(ReadFile(filenameRead)));

        } catch (IOException e) {
            System.out.println("Error writing into file!!!");
        }
    }
}
