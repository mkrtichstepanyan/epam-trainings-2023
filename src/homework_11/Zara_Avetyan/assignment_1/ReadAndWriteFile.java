package homework_11.Zara_Avetyan.assignment_1;

import java.io.*;

public class ReadAndWriteFile {

    public String readFile(String fileName) {
        String line = "";
        int data;
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                while ((data = reader.read()) != -1) {
                    line += (char) data;
                }
                return line;
            } catch (FileNotFoundException e) {
                return String.format("File not found: %s.", fileName);
            } catch (IOException e) {
                return e.toString();
            }
        }
        return "Wrong format.";
    }

    public String processData(String data) {
        String line = "";
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '_') {
                line += " ";
            } else line += (char) data.charAt(i);
        }
        return line.toUpperCase();
    }

    public void writeFile(String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else System.out.println("Wrong format.");
    }
}
