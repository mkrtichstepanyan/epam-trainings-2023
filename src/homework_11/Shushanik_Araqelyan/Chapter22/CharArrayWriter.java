package homework_11.Shushanik_Araqelyan.Chapter22;

import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriter {
    public static void main(String[] args) {
        java.io.CharArrayWriter f = new java.io.CharArrayWriter();
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

        try (FileWriter f2 = new FileWriter(" ")) {
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
