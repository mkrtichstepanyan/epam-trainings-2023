package homework_6.Shushanik_Araqelyan.chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb= new A();
        B subOb= new B();
        superOb.I = 10;
        superOb.J = 20;
        System.out.println("Contents of superOb : ");
        superOb.showij();
        System.out.println();
        subOb.I = 7;
        subOb.J = 8;
        subOb.K = 9;
        System.out.println("Contents of subOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println("Sum of i, j and k in subob :");
        subOb.sum();


    }
}
