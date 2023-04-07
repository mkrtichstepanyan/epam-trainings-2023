package homework_12.Sofya_Ghazaryan.assignment_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAndWrite {

    public static void write(String fileName, String data) throws IOException {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {

            Path path = Paths.get(fileName);
            Files.writeString(path, data);
        } else {
            System.out.println("Wrong file type");
            System.exit(1);
        }
    }

    public static String read(String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {

            Path path = Paths.get(fileName);
            try {
                byte[] bytes = Files.readAllBytes(path);
                return new String(bytes, StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.out.println("Can not read the file!!!");
                System.exit(1);
            }
        } else {
            System.out.println("Wrong file type");
            System.exit(1);
        }
        return fileName;
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
}
