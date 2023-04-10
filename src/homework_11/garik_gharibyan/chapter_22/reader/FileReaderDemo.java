package homework_11.garik_gharibyan.chapter_22.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) {

        try (FileReader fileReader =
                     new FileReader("src/homework_11/garik_gharibyan/chapter_22/reader/text.txt");
        ) {
            int c;
            while ((c = fileReader.read())!=-1){
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
