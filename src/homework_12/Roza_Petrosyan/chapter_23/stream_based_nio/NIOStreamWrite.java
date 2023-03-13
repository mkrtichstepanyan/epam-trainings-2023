package homework_12.Roza_Petrosyan.chapter_23.stream_based_nio;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Path.of("src/homework_12/Roza_Petrosyan/chapter_23/mapped_channel_read_write/test.txt")))) {
            for (int i = 0; i < 26; i++) {
                fout.write((byte) ('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
