package homework_12.TatevKocharyan.chapter22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("FileReaderDemo.java")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.println((char) c);
            }

        } catch (IOException e) {
            System.out.println("I/O error" + e);
        }
    }
}