package homework_12.garik_gharibyan.chapter_23.dir_list;

import javax.naming.directory.BasicAttribute;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {

    public FileVisitResult visitResult(Path path, BasicFileAttributes basicAttribute) throws IOException {

        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String[] args) {
        String dirName = "src\\homework_12\\garik_gharibyan\\chapter_23\\dir_list\\my_dir";

        System.out.println("directory tree starting with " + dirName + ":\n");
        try {
            Files.walkFileTree(Path.of(dirName), new MyFileVisitor());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
