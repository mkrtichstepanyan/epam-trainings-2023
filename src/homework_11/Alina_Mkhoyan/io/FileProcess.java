package homework_11.Alina_Mkhoyan.io;

import java.io.*;

public class FileProcess {
    public static void main(String[] args) {
        String fileName = "src\\homework_11\\Alina_Mkhoyan\\io\\example.txt";
        writeFile(fileName, "Bye World");
        String outputFile = "src\\homework_11\\Alina_Mkhoyan\\io\\output.txt";
        String data = readFile(fileName);
        String outputFileName = fileName.replace(".txt", ".csv");
        if (data != null) {
            String processedData = processData(data);
            writeFile(outputFile, processedData);
            writeFile(outputFileName, processedData);

        }
    }

    public static String readFile(String fileName) {
        String data = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            data = sb.toString();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
        return data;
    }

    public static void writeFile(String fileName, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(data);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
}
