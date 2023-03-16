package homework_12.Nona_Asatryan.chapter23;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {

        String dirName = "/Users/nona.asatryan/epam-trainings-2023/src/homework_12/Nona_Asatryan/chapter23";
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirName))) {
            System.out.println("Directory of " + dirName);
            for (Path path : dirstrm) {
                BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.println("<DIR>");
                } else {
                    System.out.println("         ");
                }
                System.out.println(path.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirName + " is not a directory");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
