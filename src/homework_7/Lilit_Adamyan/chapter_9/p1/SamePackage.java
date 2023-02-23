package homework_7.Lilit_Adamyan.chapter_9.p1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same package constructor");
        System.out.println("n = " + p.n);
        // System.out.println("n_pri = " 4 + p.n_pri);
        System.out.println("n_pro " + p.n_pro);
        System.out.println("n_pub " + p.n_pub);
    }
}
