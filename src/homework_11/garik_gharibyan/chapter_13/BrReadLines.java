package homework_11.garik_gharibyan.chapter_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String str;
        System.out.println("enter lines of text.");
        System.out.println("Enter 'stop' to qit.");

        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
