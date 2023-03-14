package homework_11.Yeghia_Ansuryan.chapter_13.readingStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrreadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
