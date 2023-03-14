package homework_11.Qnarik_Khachatryan.chapter_22.SequenceInput;

import homework_11.Qnarik_Khachatryan.chapter_22.SequenceInput.InputStreamEnumerator;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("src/homework_11/Qnarik_Khachatryan/chapter_22/SequenceInput/file1.txt");
        files.addElement("src/homework_11/Qnarik_Khachatryan/chapter_22/SequenceInput/file2.txt");
        files.addElement("src/homework_11/Qnarik_Khachatryan/chapter_22/SequenceInput/file3.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (NullPointerException e) {
            System.out.println("Error Opening File");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error Closing SequenceInputStream");
            }
        }
    }
}
