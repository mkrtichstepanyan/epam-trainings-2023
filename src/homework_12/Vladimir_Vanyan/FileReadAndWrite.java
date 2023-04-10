package homework_12.Vladimir_Vanyan;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadAndWrite {
    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static String readFile(String fileName) {

        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try {
                Path path = Paths.get(fileName);
                byte[] bytes = Files.readAllBytes(path);
                return new String(bytes, StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.err.println("Can't read file");
                System.exit(1);
            }
        } else {
            return "Incorrect format";
        }
        return "";
    }

    public static void writeFile(String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try {
                Path path = Paths.get(fileName);
                Files.writeString(path, data);
            } catch (IOException ex) {
                System.out.println("Can't write into file");
                System.exit(1);
            }
        }
    }
}
