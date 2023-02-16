package homework_6.Hovhannes_Gspeyan.chapter_8;

/**
 * Demonstrates A and B classes
 */
public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showIJ();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showIJ();
        subOb.showK();
        System.out.println();
        System.out.println("sum of i, j, k in subOb: ");
        subOb.sum();
    }
}
