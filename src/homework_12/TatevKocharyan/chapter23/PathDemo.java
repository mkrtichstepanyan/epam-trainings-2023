package homework_12.TatevKocharyan.chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Path.of("examples\\test.txt");
        System.out.println("File Name:" + filepath.getName(1));
        System.out.println("Path:" + filepath);
        System.out.println("Absolute path:" + filepath.toAbsolutePath());
        System.out.println("Parent:" + filepath.getParent());

        if (Files.exists(filepath)) {
            System.out.println("File exists");
        }
        System.out.println("File does not exist");
        try {
            if (Files.isHidden(filepath)) {
                System.out.println("File is hidden");
            }
            System.out.println("File is not hidden");
        } catch (IOException e) {
            System.out.println(e);
        }

        Files.isWritable(filepath);
        System.out.println("File is writable");
        Files.isReadable(filepath);
        System.out.println("File is readable");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filepath, BasicFileAttributes.class);
            if (attributes.isDirectory()) {
                System.out.println("The file is a directory");
            }
            System.out.println("The file is not a directory ");

            if (attributes.isRegularFile()) {
                System.out.println("The file is a normal file");
            }
            System.out.println("The file is not a ormal file ");
            if (attributes.isSymbolicLink()) {
                System.out.println("The file is a symbolic link");
            }
            System.out.println("The file is not a symbolic link");
            System.out.println("File last modified: " + attributes.lastModifiedTime());
            System.out.println("File size:" + attributes.size() + "Bytes");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}