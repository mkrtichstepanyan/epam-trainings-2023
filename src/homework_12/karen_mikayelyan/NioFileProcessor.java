package homework_12.karen_mikayelyan;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileProcessor {

    public static String readFile(String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try {
                Path path = Paths.get(fileName);
                byte[] bytes = Files.readAllBytes(path);
                return new String(bytes, StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.err.println("Error: An error occurred while reading file");
                System.exit(0);
            }
        } else return "Unsupported file format";
        return fileName;
    }


    public static void writeFile(String filename, String data) {
        if (filename.endsWith(".txt") || filename.endsWith(".csv") || filename.endsWith(".json")) {
            try {
                Path path = Paths.get(filename);
                Files.writeString(path, data);
                System.out.println("The data are successfully written!");
            } catch (IOException e) {
                System.err.println("Error: An error occurred while writing into file");
                System.exit(0);
            }
        } else {
            System.err.println("The data format is wrong!!!");
        }
    }


    public static String processData(String data) {
        return data.toUpperCase();
    }
}
