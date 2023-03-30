package homework_12.TatevKocharyan.chapter22;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should end up in the array";
        char[] buf = new char[s.length()];
        s.getChars(0,s.length(),buf,0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Error writing to buffer");
            return;
        }
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("into array");
        char[]c=f.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
        System.out.println("\n To a FileWriter()");
        try(FileWriter f2=new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Error writing to buffer");
        }

    }
}