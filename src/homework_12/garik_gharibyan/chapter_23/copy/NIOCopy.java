package homework_12.garik_gharibyan.chapter_23.copy;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {

        File sourceFile = new File("src\\homework_12\\garik_gharibyan\\chapter_23\\copy\\source.txt");
        File targetFile = new File("src\\homework_12\\garik_gharibyan\\chapter_23\\copy\\target.txt");
        File[] files = new File[]{sourceFile,targetFile};

        try {
            Path source = Path.of(files[0].getPath());
            Path target = Path.of(files[1].getPath());
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        }catch (InvalidPathException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
