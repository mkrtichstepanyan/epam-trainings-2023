package homework_11.Karen_Sargsyan.chapter_22;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "This is a &copy; copyright symbol " +
                "but this is &copy not.\n";
        byte[] buf = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;

        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.println("(c)");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.println("&");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    default:
                        if (!marked) {
                            System.out.println((char) c);
                        }
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }

}
