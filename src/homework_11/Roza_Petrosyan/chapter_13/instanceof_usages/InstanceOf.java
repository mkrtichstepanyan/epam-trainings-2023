package homework_11.Roza_Petrosyan.chapter_13.instanceof_usages;

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if(a instanceof A) {
            System.out.println("a is instanceof A");
        }
        if(b instanceof B) {
            System.out.println("b is instanceof B");
        }
        if(c instanceof C) {
            System.out.println("c is instanceof C");
        }
        if(c instanceof A) {
            System.out.println("c is instanceof A");
        }
        if(a instanceof C) {
            System.out.println("a is instanceof C");
        }

        System.out.println();

        A ob;

        ob = d;
        System.out.println("ob now refers to d");
        if(ob instanceof D) {
            System.out.println("ob is instanceof D");
        }

        System.out.println();

        ob = c;
        System.out.println("ob now refers to c");
        if(ob instanceof D) {
            System.out.println("ob can be cast to D");
        } else {
            System.out.println("ob can not be cast to D");
        }

        if(ob instanceof A) {
            System.out.println("ob is instanceof A");
        }

        System.out.println();

        if(a instanceof Object) {
            System.out.println("a may be cast to Object");
        }
        if(b instanceof Object) {
            System.out.println("b may be cast to Object");
        }
        if(c instanceof Object) {
            System.out.println("c may be cast to Object");
        }
        if(d instanceof Object) {
            System.out.println("c may be cast to Object");
        }

    }
}
