package homework_12.TatevKocharyan.chapter23;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList2 {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) throws IOException {
                if (Files.isWritable(filename)) return true;
                return false;
            }
        };

        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirname), how)) {
            System.out.println("Directory of " + dirname);
            for (Path entry : dirstrm) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.print("<DIR>");
                }
                System.out.print(" ");
                System.out.println(entry.getName(1));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}