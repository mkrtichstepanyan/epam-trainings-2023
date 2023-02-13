package homework_6.Araksya_Ghazaryan.chapter_8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb. showj();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of supOb: ");
        subOb. showj();
        subOb.showk();
        System.out.println();

        System.out.println(" Sum of i, j and k in subOb: " );
        subOb.sum();
    }
}