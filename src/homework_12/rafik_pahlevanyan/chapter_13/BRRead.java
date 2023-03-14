package homework_12.rafik_pahlevanyan.chapter_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        if (System.console() != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
            System.out.println("Enter characters, 'q' to quit");

            //read characters
            do {
                c = (char) bufferedReader.read();
                System.out.println(c);
            } while (c != 'q');
        }
    }
}