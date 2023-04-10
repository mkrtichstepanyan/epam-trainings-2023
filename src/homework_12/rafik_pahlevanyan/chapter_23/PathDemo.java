package homework_12.rafik_pahlevanyan.chapter_23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {

        Path filepath = Path.of("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_23\\test.txt");
        System.out.println(filepath.getName(1));
        System.out.println(filepath);
        System.out.println(filepath.toAbsolutePath());
        System.out.println(filepath.getParent());

        if (Files.exists(filepath)) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exists");
        }

        try {
            if (Files.isHidden(filepath)) {
                System.out.println("File is Hidden");
            } else {
                System.out.println("File is not hidden");
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }

        Files.isWritable(filepath);
        System.out.println("File is writable");
        Files.isReadable(filepath);
        System.out.println("File is readable");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filepath, BasicFileAttributes.class);
            if (attributes.isDirectory()) {
                System.out.println("The file is a directory");
            } else {
                System.out.println("The file is not a directory");
            }

            if (attributes.isRegularFile()) {
                System.out.println("File is a normal file");
            } else {
                System.out.println("File is not a normal file");
            }
            if (attributes.isSymbolicLink()) {
                System.out.println("The file is symbolic link");
            } else {
                System.out.println("The file is not symbolic link");
            }
            System.out.println("File last modified: " + attributes.lastModifiedTime());
            System.out.println("File size: " + attributes.size() + " Bytes");
        } catch (IOException e) {
            System.out.println("Error reading attributes: " + e);
        }
    }
}
