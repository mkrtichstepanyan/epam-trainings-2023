package homework_11.Qnarik_Khachatryan.chapter_22;

//Demonstrate FileReader

import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/homework_11/Qnarik_Khachatryan/chapter_22/FileReaderDemo.java")) {
            int c;

            //Read and display the file.
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
