package homework_8.gevorg_arghushyan_chapter_9.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("Constructor of derivative class");
        System.out.println("n = " + n);
        //Just class
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
