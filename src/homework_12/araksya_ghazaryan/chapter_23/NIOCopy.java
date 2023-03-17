package homework_12.araksya_ghazaryan.chapter_23;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: Copy from to");
            return;
        }
        try {
            Path sours = Path.of(args[0]);
            Path target = Path.of(args[1]);
            Files.copy(sours,target, StandardCopyOption.REPLACE_EXISTING);
        }catch (InvalidPathException e){
            System.out.println("Path Error " + e);
        }catch (IOException e){
            System.out.println("I/O Error " + e);
            System.exit(1);
        }
    }
}
