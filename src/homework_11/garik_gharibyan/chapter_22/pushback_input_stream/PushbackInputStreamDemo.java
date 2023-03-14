package homework_11.garik_gharibyan.chapter_22.pushback_input_stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String s = "if( a == 0 ) a = 0;\n";
        byte[] buf = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        try (PushbackInputStream p = new PushbackInputStream(in)){

            while ((c = p.read()) != -1){
                switch (c){
                    case '=':
                        if ((c = p.read()) == '='){
                            System.out.print(".eq.");
                        }else {
                            System.out.print("<-");
                            p.unread(c);

                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
    }
}
