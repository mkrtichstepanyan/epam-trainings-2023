package homework_12.garik_gharibyan.chapter_23.dir_list;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirName = "src\\homework_12\\garik_gharibyan\\chapter_23\\dir_list\\my_dir";

        try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(Path.of(dirName))) {
            System.out.println("Directory of " + dirName);

            for (Path entry: dirStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()){
                    System.out.print("<DIR> ");
                }else {
                    System.out.print("                     ");
                }
                System.out.println(entry.getName(1));
            }
        }catch (InvalidPathException e) {
            throw new RuntimeException(e);
        }catch (NotDirectoryException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
