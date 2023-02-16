package homework_6.Shushanik_Araqelyan.chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb= new A();
        B6 subOb= new B6();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb : ");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb : ");
        subOb.showij();
        System.out.println("Sum of i, j and k in subob :");
        subOb.sum();


    }
}
