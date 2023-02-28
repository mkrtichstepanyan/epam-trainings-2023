package homework_8.robert_nazaryan.p2;

public class OtherPackage {
    OtherPackage () {
        homework_8.robert_nazaryan.p1.Protection p = new homework_8.robert_nazaryan.p1.Protection();
        System.out.println("other package constructor");

        //class or package only
        //System.out.println("n = " + p.n);

        //class only
        //System.out.println("n_pri = " + p.n_pri);

        //class, subclass or package only
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
