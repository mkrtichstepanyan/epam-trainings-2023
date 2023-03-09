package homework_11.Roza_Petrosyan.chapter_22.enumeration_input_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();

        files.addElement("src/homework_11/Roza_Petrosyan/chapter_22/enumeration_input_stream/file1.txt");
        files.addElement("src/homework_11/Roza_Petrosyan/chapter_22/enumeration_input_stream/file2.txt");
        files.addElement("src/homework_11/Roza_Petrosyan/chapter_22/enumeration_input_stream/file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        try {
            InputStream input = new SequenceInputStream(ise);

            try {
                while ((c = input.read()) != -1) {
                    System.out.println((char) c);
                }
            } catch (NullPointerException e) {
                System.out.println("Error Opening File.");
            } catch (IOException e) {
                System.out.println("I/O Error: " + e);
            } finally {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("Error Closing SequenceInputStream.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
