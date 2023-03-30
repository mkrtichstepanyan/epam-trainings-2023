package homework_12.TatevKocharyan.chapter22;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        String s = "if (a==4) a=0; \n";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        CharArrayReader in = new CharArrayReader(buf);
        int c;
        try (PushbackReader f = new PushbackReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = f.read()) == '=') {
                            System.out.println(".eq");
                        } else {
                            System.out.println("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.println((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}