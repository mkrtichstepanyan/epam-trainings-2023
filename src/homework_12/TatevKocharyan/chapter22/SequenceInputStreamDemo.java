package homework_12.TatevKocharyan.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();

        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        try {
            while ((c = input.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            System.out.println("I/O Error" + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error closing");
            }
        }

    }
}