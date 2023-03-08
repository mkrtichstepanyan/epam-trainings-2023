package homework_11.Roza_Petrosyan.chapter_13.buffer_readline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        if (System.console() != null) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

            String str;

            System.out.println("Enter lines of text.");
            System.out.println("Enter 'stop' to quit.");

            do {
                str = br.readLine();
                System.out.println(str);
            } while (!str.equals("stop"));
        }
    }
}
