package homework_12.Radik_Manasyan.chapter22;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList2 {
    public static void main(String[] args) {
        String dirName = "src/homework_12";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                if (Files.isWritable(entry)) {
                    return true;
                }
                return false;
            }
        };

        try (DirectoryStream<Path> dirStrm =
                     Files.newDirectoryStream(Path.of(dirName), how)) {
            System.out.println("Каталог: " + dirName);
            for (Path entry : dirStrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attribs.isDirectory()) {
                    System.out.print("<DIR> ");
                } else {
                    System.out.print("          ");
                }
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошбка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirName + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }

    }
}
