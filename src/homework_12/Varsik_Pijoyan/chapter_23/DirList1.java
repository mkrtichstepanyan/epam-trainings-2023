package homework_12.Varsik_Pijoyan.chapter_23;

//Displaying a directory of only those files that are writable.

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class DirList1 {
    public static void main(String[] args) {
        String dirName = "\\MyDir";

        //Create a filter that returns true only for writable files.

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {

            public boolean accept(Path fileName) throws IOException {
               if (Files.isWritable(fileName))
                   return true;
               return false;
            }
        };

        //Obtaining and managing a directory stream of writable files.

        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(Path.of(dirName), how))
        {
            System.out.println("Directory of " + dirName);

            for (Path entry : dirStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory()){
                    System.out.println("<DIR> ");
                }else {
                    System.out.println("     ");
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
