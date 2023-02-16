package homework_6.Hayk_Davtyan.chapter_8.Example_1;

import homework_6.Hayk_Davtyan.chapter_8.Example_1.A;
import homework_6.Hayk_Davtyan.chapter_8.Example_1.B;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i,j,k in subOb: ");
        subOb.sum();
    }
}
