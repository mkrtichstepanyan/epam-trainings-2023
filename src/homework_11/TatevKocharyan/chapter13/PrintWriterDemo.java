package homework_11.TatevKocharyan.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("This is a strig");
        int i=-7;
        pw.println(i);
        double d=4.5e-7;
        pw.println(d);
    }
}
