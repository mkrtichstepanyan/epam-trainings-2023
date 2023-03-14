package homework_11.garik_gharibyan.chapter_22.pushback_reader;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        String s = "if(a == 0) a = 0;\n";
        char[] chars = new char[s.length()];
        s.getChars(0, s.length(), chars, 0);

        int c;
        CharArrayReader charArrayReader = new CharArrayReader(chars);

        try (PushbackReader f = new PushbackReader(charArrayReader)) {

            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = f.read()) == '=') {
                            System.out.print(".eq.");
                        } else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("I/O error 0" + e);
        }
    }
}
