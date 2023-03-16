package homework_11.garik_gharibyan.chapter_22.char_array_reader;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String text = "absdefghijklmnopqrstuvwxyz";
        char[] buffer = new char[text.length()];
        text.getChars(0,text.length(),buffer,0);
        int c;

        try(CharArrayReader input1 = new CharArrayReader(buffer)) {

            System.out.println("input1 is: ");
            while ((c = input1.read()) != -1){
                System.out.print((char)  c);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O error " + e);
        }

        try(CharArrayReader input2 = new CharArrayReader(buffer,0,5)) {

            System.out.println("input2 is: ");
            while ((c = input2.read()) != -1){
                System.out.print((char)  c);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O error " + e);
        }

    }
}
