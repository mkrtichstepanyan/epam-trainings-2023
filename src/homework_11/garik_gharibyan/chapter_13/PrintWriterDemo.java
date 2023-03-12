package homework_11.garik_gharibyan.chapter_13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pr = new PrintWriter(System.out,true);

        pr.println("This is a string.");
        int i = -7;
        pr.println(i);
        double d = 4.5 - 5;
        System.out.println(d);
    }
}
