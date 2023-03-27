package homework_11.Liana_Gevorgyan.assignment_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIOHelper {

    static final String[] allowedExtensions = {"txt", "csv", "json"};

    static final String relativePath = "./src/homework_11/Liana_Gevorgyan/assignment_1/";

    public static String readFile(String fileName) throws IOException {

        if (fileName.contains("/")) {
            throw new IllegalArgumentException("Please provide only full file name");
        } else if (!fileName.contains(".")) {
            throw new IllegalArgumentException("Please provide file name with extension");
        } else if (!isExtensionAllowed(fileName.split("\\.")[1])) {
            throw new IllegalArgumentException("Please provide file with correct extension, allowed txt, csv, json");
        }

        fileName = relativePath + fileName;
        Path filePath = Path.of(fileName);

        String content = Files.readString(filePath);
        return content;
    }

    public static void writeFile(String fileName, String data) throws IOException {
        fileName = relativePath + fileName;
        Path filePath = Path.of(fileName);
        Files.write(filePath, data.getBytes());
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static String getNewFileName(String fileName) {
        String[] splitted = fileName.split("\\.");
        return splitted[0] + "_modified" + "." + splitted[1];
    }

    private static boolean isExtensionAllowed(String ext) {
        for (String allowedExt : allowedExtensions) {
            if (ext.equalsIgnoreCase(allowedExt))
                return true;
        }

        return false;
    }

}
