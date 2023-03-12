package homework_12.Varsik_Pijoyan.chapter_23;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) throws IOException{
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList{
    public static void main(String[] args) {
        String dirName = "\\MyDir";

        System.out.println("Directory tree starting with " + dirName + ":\n");

        try {
            Files.walkFileTree(Path.of(dirName), new MyFileVisitor());
        }catch (IOException e){
            System.out.println("I/O Error: " + e);
        }
    }
}
