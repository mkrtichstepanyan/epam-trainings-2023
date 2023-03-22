package homework_11.TatevKocharyan.chapter13;

public class InstanceOf {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A) {
            System.out.println("A is instanceof a");
        }
        if (b instanceof B) {
            System.out.println("B is instanceof b");
        }
        if (c instanceof C) {
            System.out.println("C is instanceof c");
        }
        if (d instanceof D) {
            System.out.println("D is instanceof d");
        }
        if (a instanceof C) {
            System.out.println("A can cast to C ");
        }
        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob now refers to d");
        if (ob instanceof D) {
            System.out.println("ob is instance of D");
        }
        System.out.println();
        ob = c;
        System.out.println("ob now refers to c");

        if (ob instanceof D) {
            System.out.println("ob is instance of D");
        } else System.out.println("ob cannot be cast to D");


        if (ob instanceof A) {
            System.out.println("ob is instance of A");
        }
        System.out.println();
        if (a instanceof Object) {
            System.out.println("a may be cast to object");
        }
        if (b instanceof Object) {
            System.out.println("b may be cast to object");
        }
        if (c instanceof Object) {
            System.out.println("c may be cast to object");
        }
        if (d instanceof Object) {
            System.out.println("d may be cast to object");
        }
    }
}