package homework_8.Anna_manukyan.chapter_8.p2;

public class Derived extends Protection{
    public Derived() {
        System.out.println("Derived constructor");
        System.out.println("n =  " + n);
//        System.out.println("n_pri =  " + n_pri);
        System.out.println("n_pro =  " + n_pro);
        System.out.println("n_pub =  " + n_pub);
    }
}