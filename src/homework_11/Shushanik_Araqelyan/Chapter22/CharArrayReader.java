package homework_11.Shushanik_Araqelyan.Chapter22;

import java.io.IOException;

public class CharArrayReader {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrsuvwxyz";
        int length = tmp.length();
        char[] c = new char[length];
        tmp.getChars(0, length, c, 0);
        int i;

        try (java.io.CharArrayReader input1 = new java.io.CharArrayReader(c)) {
            System.out.println("Input is: ");
            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }

        try (java.io.CharArrayReader input2 = new java.io.CharArrayReader(c, 0, 5)) {
            System.out.println("Input is: ");
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}


