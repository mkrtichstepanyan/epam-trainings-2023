package homework_8.Alina_Mkhoyan.chapter_9.p2;

public class Derived2 extends Protection2 {
    public Derived2() {
        System.out.println("Derived constructor");
        System.out.println("n =  " + n);
//        System.out.println("n_pri =  " + n_pri);
        System.out.println("n_pro =  " + n_pro);
        System.out.println("n_pub =  " + n_pub);
    }
}