package homework_11.Karen_Sargsyan.chapter_13.br_read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        System.out.println("Enter characters, 'q' to quit.");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

}
