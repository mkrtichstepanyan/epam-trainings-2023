package homework_11.TatevKocharyan.chapter13;

import homework_6.Lilit_Adamyan.chapter_8.SecondUseSuper.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) break;
        }
        System.out.println("\n Here is your file");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}