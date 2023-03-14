package homework_12.robert_nazaryan;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {

    public String readFile(String fileName) {
        if (isValidFileFormat(fileName)) {
            try {
                Path path = Paths.get(fileName);
                byte[] bytes = Files.readAllBytes(path);
                return new String(bytes, StandardCharsets.UTF_8);

            } catch (FileNotFoundException e) {
                System.out.println(fileName + ": not found");
            } catch (IOException e) {
                System.out.println("Can't read this file");
            }
        } else {
            return "Wrong format";
        }
        return "";
    }

    public void writeFile(String fileName, String data) {
        if (isValidFileFormat(fileName)) {
            try{
                Path path = Paths.get(fileName);
                Files.writeString(path,data);
            } catch (IOException e) {
                System.out.println("Cant't write in this file");
            }
        } else {
            System.out.println("Wrong format");
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    private boolean isValidFileFormat(String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            return true;
        }
        return false;
    }
}
