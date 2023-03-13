package homework_11.garik_gharibyan.chapter_22.buffer_reader;

import java.io.*;

public class BufferReaderDemo {

    public static void main(String[] args) {
        String s = "This is a &copy; copyright symbol " +
                "but this is &copy not.\n";
        char[] buffer = new char[s.length()];
        s.getChars(0,s.length(),buffer,0);

        CharArrayReader in = new CharArrayReader(buffer);
        int c;
        boolean marked = false;

        try(BufferedReader f = new BufferedReader(in)) {

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
