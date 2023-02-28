package homework_8.robert_nazaryan.robert_nazaryan.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("derived contructor");
        System.out.println("n = " + n);

        //class only
        //System.out.println("n = " 4 + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
