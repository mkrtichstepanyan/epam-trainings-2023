package homework_11.Roza_Petrosyan.chapter_23.directory_stream;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src/homework_11/Roza_Petrosyan/chapter_23/directory_stream";

        try (DirectoryStream<Path> dirstrm =
                     Files.newDirectoryStream(Path.of(dirname))) {
            System.out.println("Directory of " + dirname);

            for (Path entry : dirstrm) {
                BasicFileAttributes attribs =
                        Files.readAttributes(entry, BasicFileAttributes.class);
                if (attribs.isDirectory()) {
                    System.out.println("<DIR> ");
                } else {
                    System.out.println("       ");
                }
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " is not a directory");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
