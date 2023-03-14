package homework_12.rafik_pahlevanyan.chapter_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {

        if (System.console() != null) {
            //create a BufferedReader using System.in
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
            String[] str = new String[100];
            System.out.println("Enter lines of text");
            System.out.println("Enter 'stop' to quit");
            for (int i = 0; i < 100; i++) {
                str[i] = br.readLine();
                if (str[i].equals("stop")) {
                    break;
                }
                System.out.println("\n Here is your file");
                //display the lines
                for (int j = 0; j < 100; j++) {
                    if (str[i].equals("stop")) {
                        break;
                    }
                    System.out.println(str[i]);
                }
            }
        }
    }
}