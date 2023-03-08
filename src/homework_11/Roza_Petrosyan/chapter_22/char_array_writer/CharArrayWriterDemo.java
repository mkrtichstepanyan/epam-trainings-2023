package homework_11.Roza_Petrosyan.chapter_22.char_array_writer;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should end up in the array";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Error writing to buffer");
            return;
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        char[] b = f.toCharArray();

        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }

        System.out.println("\nTo an OutputStream");

        try (FileWriter f2 = new FileWriter("/Users/user/Desktop/RD/epam-trainings-2023/src/homework_11/Roza_Petrosyan/chapter_22/char_array_writer/test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
            return;
        }

        System.out.println("Doing a reset");
        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }

        System.out.println(f.toString());
    }
}
