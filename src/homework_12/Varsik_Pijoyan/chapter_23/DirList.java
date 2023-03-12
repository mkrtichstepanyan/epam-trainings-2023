package homework_12.Varsik_Pijoyan.chapter_23;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class DirList {
    public static void main(String[] args) {
        String dirName = "\\MyDir";

        //Obtaining and managing a directory stream within a try block.
        try(DirectoryStream<Path> dirStream =
                Files.newDirectoryStream(Path.of(dirName)) )
        {
            System.out.println("Directory of: " + dirName);

            //Because DirectoryStream implements Iterable, we
            //can use a "foreach" loop to display the directory.

            for (Path entry : dirStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory()){
                    System.out.println("<DIR> ");
                }else {
                    System.out.println("    ");
                }

                System.out.println(entry.getName(1));
            }
        }catch (InvalidPathException e){
            System.out.println("Path Error: " + e);
        }catch (NotDirectoryException e){
            System.out.println(dirName + " is not a directory.");
        }catch (IOException e){
            System.out.println("I/O Error: " + e);
        }
    }
}
