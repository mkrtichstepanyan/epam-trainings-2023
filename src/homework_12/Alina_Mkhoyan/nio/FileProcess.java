package homework_12.Alina_Mkhoyan.nio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcess {
    public static void main(String[] args) {
        String inputFile = "src\\homework_12\\Alina_Mkhoyan\\nio\\input.txt";
        writeFile(inputFile, "Bye World");
        String outputFile = "src\\homework_12\\Alina_Mkhoyan\\nio\\output.txt";
        String outputFileName = inputFile.replace(".txt", ".json");
        String data = readFile(inputFile);
        String processedData = processData(data);
        writeFile(outputFile, processedData);
        writeFile(outputFileName, processedData);

    }

    public static String readFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
            System.err.println(e.getMessage());
            System.exit(1);
        }
        return null;
    }

    public static void writeFile(String fileName, String data) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.err.println("Error writing file: " + fileName);
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
}
