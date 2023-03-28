package homework_12.Radik_Manasyan.chapter22;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String[] args) {
        String dirName = "src/homework_12";

        System.out.println("Дерево каталогов начиная с аталога" + dirName + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());

        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }
    }
}
