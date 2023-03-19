package homework_12.garik_gharibyan.chapter_23;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ShowFile {
    public static void main(String[] args) {
        File file = new File("src\\homework_12\\garik_gharibyan\\chapter_23\\write\\test.txt");

        try(InputStream fio = Files.newInputStream(Path.of(file.getPath()))) {

            int i;
            i = fio.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fio.read();
            }
        }catch (InvalidPathException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
