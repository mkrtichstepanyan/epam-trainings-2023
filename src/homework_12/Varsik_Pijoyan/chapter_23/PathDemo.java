package homework_12.Varsik_Pijoyan.chapter_23;

import homework_10.Ani_Kovalenko.Pizza_Exceptions.Basic;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Path.of("examples\\test.txt");

        System.out.println("File Name: " + filePath.getName(1));
        System.out.println("Path: " + filePath);
        System.out.println("Absolute Path: " + filePath.toAbsolutePath());
        System.out.println("Parent: " + filePath.getParent());

        if (Files.exists(filePath)){
            System.out.println("File exist.");
        }else {
            System.out.println("File does not exist.");
        }

        try {
            if (Files.isHidden(filePath)){
                System.out.println("File is hidden.");
            }else {
                System.out.println("File is not hidden.");
            }
        }catch (IOException e){
            System.out.println("I/O Error: " + e);
        }

        Files.isWritable(filePath);
        System.out.println("File is writable.");

        Files.isReadable(filePath);
        System.out.println("File is readable.");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);

            if (attributes.isDirectory()){
                System.out.println("The file is directory.");
            }else {
                System.out.println("The file is not directory.");
            }

            if (attributes.isRegularFile()){
                System.out.println("The file is a normal file.");
            }else {
                System.out.println("The file is not a normal file.");
            }

            if (attributes.isSymbolicLink()){
                System.out.println("The file is a symbolic link.");
            }else {
                System.out.println("The file is not a symbolic link");
            }

            System.out.println("File last modified: " + attributes.lastModifiedTime());
            System.out.println("File size: " + attributes.size() + "Bytes");
        }catch (IOException e){
            System.out.println("Error reading attributes: " + e);
        }
    }
}
