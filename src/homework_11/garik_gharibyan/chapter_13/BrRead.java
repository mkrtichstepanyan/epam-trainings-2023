package homework_11.garik_gharibyan.chapter_13;

import java.io.*;
import java.nio.charset.Charset;

public class BrRead {
    public static void main(String[] args) throws IOException {

        Charset charset = System.console().charset();

        char c;

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in,charset));

        System.out.println(charset.displayName());
        System.out.println(charset.name());

        System.out.println("Enter characters 'q' to quit");
        do {
            c =(char) bufferedReader.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
