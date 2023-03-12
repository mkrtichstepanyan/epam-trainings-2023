package homework_10.garik_gharibyan.chapter_10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        try {
            for (int i = 0; i < 32000; i++) {
                System.out.println(i);
                b = r.nextInt();
                System.out.println(b);
                c = r.nextInt();
                System.out.println(c);
                a = 12345 / (b / c);
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("Division by zero");
            a = 0;
        }
        System.out.println("a: " + a);

    }
}
