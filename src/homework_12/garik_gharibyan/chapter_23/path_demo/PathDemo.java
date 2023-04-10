package homework_12.garik_gharibyan.chapter_23.path_demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Path.of("src\\homework_12\\garik_gharibyan\\chapter_23\\copy\\source.txt");

        System.out.println("File name: " + filePath.getName(1));
        System.out.println("File path: " + filePath);
        System.out.println("Absolute path: " + filePath.toAbsolutePath());
        System.out.println("Parent: " + filePath.getParent());

        if (Files.exists(filePath)){
            System.out.println("File exists");
        }else {
            System.out.println("FIle does not exists");
        }

        try {
            if (Files.isHidden(filePath)){
                System.out.println("File is Hidden");
            }else {
                System.out.println("File is not hidden");
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }

        if (Files.isWritable(filePath)){
            System.out.println("file is writable");
        }

        if (Files.isReadable(filePath)){
            System.out.println("file is readable");
        }

        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            if (attributes.isDirectory()){
                System.out.println("file is directory");
            }else {
                System.out.println("file is not directory");
            }
            if (attributes.isRegularFile()){
                System.out.println("the file is a normal file");
            }else {
                System.out.println("the file is not a normal file");
            }
            if (attributes.isSymbolicLink()){
                System.out.println("the file is a symbolic link");
            }else {
                System.out.println("the file is not a symbolic link");
            }

            System.out.println("file last modified " + attributes.lastModifiedTime());
            System.out.println("file size " + attributes.size() + " Bytes");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
