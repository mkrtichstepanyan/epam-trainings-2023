package homework_11.garik_gharibyan.chapter_22.sequence_input_stream;

import java.io.IOException;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {

        int c;
        Vector<String> files = new Vector<>();
        files.addElement("src/homework_11/garik_gharibyan/chapter_22/sequence_input_stream/text1");
        files.addElement("src/homework_11/garik_gharibyan/chapter_22/sequence_input_stream/text2");
        files.addElement("src/homework_11/garik_gharibyan/chapter_22/sequence_input_stream/text3");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);

        SequenceInputStream sequenceInputStream = new SequenceInputStream(ise);


        try {
            c = sequenceInputStream.read();
            while (c != -1) {
                System.out.print((char) c);
                c = sequenceInputStream.read();
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        } finally {
            try {
                sequenceInputStream.close();
            } catch (IOException e) {
                System.out.println("Error closing SequenceInputStream");
            }
        }

    }
}

