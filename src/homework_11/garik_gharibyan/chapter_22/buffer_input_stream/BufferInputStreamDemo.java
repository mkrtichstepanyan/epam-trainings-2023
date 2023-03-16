package homework_11.garik_gharibyan.chapter_22.buffer_input_stream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferInputStreamDemo {

    public static void main(String[] args) {
        String s = "This is a &copy; copyright symbol " +
                "but this is &copy not.\n";
        byte[] buf = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;

        try(BufferedInputStream f = new BufferedInputStream(in)) {

            c = f.read();
            while (c != -1){
                switch (c){
                    case '&':
                        if (!marked){
                            f.mark(32);
                            marked = true;
                        }else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked){
                            marked = false;
                            System.out.print("(c)");
                        }else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (marked){
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked){
                            System.out.print((char) c);
                            break;
                        }
                }
                c = f.read();
            }

        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
    }
}
