package homework_6.Karen_Mikayelyan.chapter_8.simpleInheritane;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // the superclass maybe used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showIJ();
        System.out.println();

        /* The subclass has access to all public members of its superclass*/
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showIJ();
        subOb.showK();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb: ");
        subOb.sum();

    }
}
