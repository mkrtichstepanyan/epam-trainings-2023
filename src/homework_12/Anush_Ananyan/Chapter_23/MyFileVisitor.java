package homework_12.Anush_Ananyan.Chapter_23;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs)
        throws IOException{
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

