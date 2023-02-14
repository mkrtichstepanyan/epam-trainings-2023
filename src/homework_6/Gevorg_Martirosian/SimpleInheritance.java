package homework_6.Gevorg_Martirosian;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb content: ");
        superOb.showij();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb content: ");
        subOb.showij();
        subOb.showk();

        System.out.println("sum of i, j and k: ");
        subOb.sum();
        superOb.showij();
    }
}
