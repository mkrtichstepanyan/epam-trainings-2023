package homework_12.araksya_ghazaryan.chapter_23;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class NIOStreanWrite {
    public static void main(String[] args) {
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Path.of("/home/araksya/Rd_Epam/epam-trainings-2023/src/homework_12/araksya_ghazaryan/chapter_23/test.txt"))))
        {
            for (int i = 0; i < 26; i++)
                fout.write((byte)('A' + i) );
        }catch (InvalidPathException e){
            System.out.println("Path Error " + e);
        }catch (IOException e){
            System.out.println("I/O Error " + e);
        }
    }
}