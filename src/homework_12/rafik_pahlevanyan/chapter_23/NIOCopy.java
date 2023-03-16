package homework_12.rafik_pahlevanyan.chapter_23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NIOCopy {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: Copy from to");
            return;
        }
        try {
            Path source = Path.of(args[0]);
            Path target = Path.of(args[1]);
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Path Error: " + e);
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }
    }
}
