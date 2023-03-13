package homework_12.rafik_pahlevanyan.chapter_22.file_read_write;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\file_read_write\\FileReaderDemo.java")) {
            int c;
            //Read and display the file
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
