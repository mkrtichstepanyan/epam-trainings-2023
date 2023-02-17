package homework_6.Armen_Martirosyan.Chapter_8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Contents of super.Ob; ");
        superOb.showIJ();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Contents of sub.Ob");
        subOb.showIJ();
        subOb.showK();
        System.out.println();

        System.out.println("Sum of  i, j, k in subOb:");
        subOb.sum();
    }
}
