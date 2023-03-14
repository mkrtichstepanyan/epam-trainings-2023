package homework_12.rafik_pahlevanyan.chapter_13;

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("a is instance of A");
        }
        if (b instanceof B) {
            System.out.println("b is instance of B");
        }
        if (c instanceof C) {
            System.out.println("c is instance of C");
        }
        if (c instanceof A) {
            System.out.println("c can be cast to A");
        }
        if (a instanceof C) {
            System.out.println("a can be cast to C");
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
            System.out.println("ob can be cast to D");
        } else {
            System.out.println("ob cannot be cast to D");
        }

        if (ob instanceof A) {
            System.out.println("ob can be cast to A");
        }
        System.out.println();

        if (a instanceof Object) {
            System.out.println("a maybe cast to Object");
        }
        if (b instanceof Object) {
            System.out.println("b maybe cast to Object");
        }
        if (c instanceof Object) {
            System.out.println("c maybe cast to Object");
        }
        if (d instanceof Object) {
            System.out.println("d maybe cast to Object");
        }
    }
}
