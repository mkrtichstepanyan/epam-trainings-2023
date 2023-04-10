package homework_11.garik_gharibyan.chapter_13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("a is instance of A.");
        }
        if (b instanceof B) {
            System.out.println("c is instance of C.");
        }
        if (c instanceof C) {
            System.out.println("d is instance of D.");
        }
        System.out.println();

        A ob;

        ob = d;
        System.out.println("ob now refers to D.");
        if (ob instanceof D) {
            System.out.println("ob is instance of d.");
        }
        System.out.println();

        ob = c;
        System.out.println("ob now refers to C.");
        if (ob instanceof D) {
            System.out.println("ob can be cast to D.");
        } else {
            System.out.println("ob can not be cast to D.");
        }
        if (ob instanceof A) {
            System.out.println("ob can be cast to A.");
        }
        System.out.println();

        if (a instanceof Object) {
            System.out.println("a may be cast yo Object.");
        }
        if (b instanceof Object) {
            System.out.println("b may be cast yo Object.");
        }
        if (c instanceof Object) {
            System.out.println("c may be cast yo Object.");
        }
        if (d instanceof Object) {
            System.out.println("d may be cast yo Object.");
        }

    }
}
