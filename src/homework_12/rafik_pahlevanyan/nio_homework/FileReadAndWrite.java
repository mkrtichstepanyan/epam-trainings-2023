package homework_12.rafik_pahlevanyan.nio_homework;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadAndWrite {
    public static void write(String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try {
                Path path = Paths.get(fileName);
                Files.writeString(path, data);
            } catch (IOException e) {
                System.out.println("Error!!! Can not write into file");
                System.exit(1);
            }
        } else {
            System.err.println("Wrong data Format");
            System.exit(1);
        }
    }

    public static String read(String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try {
                Path path = Paths.get(fileName);
                byte[] bytes = Files.readAllBytes(path);
                return new String(bytes, StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.err.println("Error!! Can't read file");
                System.exit(1);
            }
        } else {
            return "Wrong Format";
        }
        return "";
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
}
