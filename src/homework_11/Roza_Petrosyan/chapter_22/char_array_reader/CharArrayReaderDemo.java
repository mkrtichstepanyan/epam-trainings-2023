package homework_11.Roza_Petrosyan.chapter_22.char_array_reader;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrsuvwxyz";
        int length = tmp.length();
        char[] c = new char[length];
        tmp.getChars(0, length, c, 0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("Input is: ");
            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }

        try (CharArrayReader input2 = new CharArrayReader(c, 0, 5)) {
            System.out.println("Input is: ");
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
