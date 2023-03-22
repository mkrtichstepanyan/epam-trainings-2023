package homework_12.garik_gharibyan.chapter_23;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOStreamWrite {
    public static void main(String[] args) {
        File file = new File("src\\homework_12\\garik_gharibyan\\chapter_23\\write\\test.txt");

        try(BufferedOutputStream outputStream =new BufferedOutputStream(Files.newOutputStream(Path.of(file.getPath())))) {
            for (int i = 0; i < 26; i++) {
                outputStream.write((byte) ('A' + i));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
