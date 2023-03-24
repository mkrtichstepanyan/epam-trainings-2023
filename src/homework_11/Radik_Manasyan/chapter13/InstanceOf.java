package homework_11.Radik_Manasyan.chapter13;

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("a является экземпляром A");
        }
        if (b instanceof B) {
            System.out.println("b является экземпляром B");
        }
        if (c instanceof A) {
            System.out.println("c можно превести к типу A");
        }
        if (a instanceof C) {
            System.out.println("a можно превести к типу D");
        }
        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob является экземпляром D");
        if (ob instanceof D) {
            System.out.println("ob является экземпляром D");
        }

        System.out.println();

        ob = c;
        System.out.println("ob тепер ссылается на c");
        if (ob instanceof D) {
            System.out.println("ob можно превести к типу D");
        } else {
            System.out.println("ob нельзя превести к типу D");
        }

        if (ob instanceof A) {
            System.out.println("ob можно превести к типу A");
        }

        System.out.println();
        if (a instanceof Object) {
            System.out.println("a можно превести к типу Object");
        }

        if (b instanceof Object) {
            System.out.println("b можно превести к типу Object");
        }

        if (c instanceof Object) {
            System.out.println("c можно превести к типу Object");
        }

        if (d instanceof Object) {
            System.out.println("d можно превести к типу Object");
        }
    }
}
