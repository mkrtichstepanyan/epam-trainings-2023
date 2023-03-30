package homework_12.TatevKocharyan.chapter22;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "dfdfdgffgfgfggdfgdgfgg";
        int lenght = tmp.length();
        char[] c = new char[lenght];
        tmp.getChars(0, lenght, c, 0);
        int i;
        try (CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("input1 is:");
            while ((i = input1.read()) != -1) {
                System.out.println((char) i);
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        try (CharArrayReader input2 = new CharArrayReader(c, 0, 5)) {
            System.out.println("input2 is:");
            while ((i = input2.read()) != -1) {
                System.out.println((char) i);
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}