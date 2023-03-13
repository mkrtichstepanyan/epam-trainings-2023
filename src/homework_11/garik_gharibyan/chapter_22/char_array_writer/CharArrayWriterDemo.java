package homework_11.garik_gharibyan.chapter_22.char_array_writer;

import java.io.*;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        String s = "This should end up in the array";
        char[] buffer = new char[s.length()];
        s.getChars(0,s.length(),buffer,0);

        CharArrayWriter f = new CharArrayWriter();

        try {
            f.write(buffer);
        } catch (IOException e) {
            System.out.println("Error writing to buffer " +e);
        }
        System.out.println("Buffer as a String");
        System.out.println(f.toString());
        System.out.println("Into array");

        char[] c = f.toCharArray();
        for (char ch:c) {
            System.out.print(ch);
        }

        System.out.println("\nTo file writer");

        try(FileWriter f2 = new FileWriter("src/homework_11/garik_gharibyan/chapter_22/char_array_writer/text.txt")){

            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
        System.out.println("Doing reset");

        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }

        System.out.println(f);
    }
}
