package homework_12.TatevKocharyan.chapter23;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirname))) {
            System.out.println("Directory of " + dirname);
            for (Path entry : dirstrm) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.print("<DIR>");
                }
                System.out.print(" ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException | IOException e) {
            System.out.println(e);
        }
    }
}