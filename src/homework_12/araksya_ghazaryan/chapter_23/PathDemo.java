package homework_12.araksya_ghazaryan.chapter_23;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Path.of("/home/araksya/Rd_Epam/epam-trainings-2023/src/homework_12/araksya_ghazaryan/chapter_23/test.txt");
        System.out.println("File name: " +filePath.getName(1));
        System.out.println("Path: " + filePath);
        System.out.println("Absolute Path: " + filePath.toAbsolutePath());
        System.out.println("Parent: " + filePath.getParent());

        if(Files.exists(filePath))
            System.out.println("File exists");
        try {
           if(Files.isHidden(filePath))
               System.out.println("File is hidden");
           else
               System.out.println("Fil eis not exists");
        }catch (IOException e){
            System.out.println(" I/O Error" + e);
        }
        Files.isWritable(filePath);
        System.out.println("File is Writable");

        Files.isReadable(filePath);
        System.out.println("File is Readable");

        try {
            BasicFileAttributes attribs =
                    Files.readAttributes(filePath, BasicFileAttributes.class);

            if (attribs.isDirectory())
                System.out.println("The file is Directory");
            else
                System.out.println("The file is not  a Directory");

            if(attribs.isRegularFile())
                System.out.println("The file is a normal file");
            else
                System.out.println("The file is not a normal file");

            if(attribs.isSymbolicLink())
                System.out.println("The file is asymbolic link");
            else
                System.out.println("the file is not symbolik link");

            System.out.println("File last modified: " + attribs.lastModifiedTime());
            System.out.println("File size: " + attribs.size() + "Bytes");
        }catch (IOException e) {
            System.out.println("Error reading attributes: " + e);
        }
    }
}