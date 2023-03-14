package homework_12.rafik_pahlevanyan.chapter_22.sequence_input_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\sequence_input_stream\\file.txt");
        files.addElement("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\sequence_input_stream\\file1.txt");
        files.addElement("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\sequence_input_stream\\file2.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        try {
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (NullPointerException e) {
            System.out.println("Error opening file");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error closing sequenceInputStream");
            }
        }
    }
}
