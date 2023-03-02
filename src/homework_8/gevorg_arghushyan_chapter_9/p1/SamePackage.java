package homework_8.gevorg_arghushyan_chapter_9.p1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Class constructor from the same package");
        System.out.println("n = " + p.n);
        //Just class
        //System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
