package homework_8.Hovhannes_Gspeyan.chapter_9.p1;

public class SamePackage {

    SamePackage(){
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);

        //class only
        //  System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.nPro);
        System.out.println("n_pub = " + p.nPub);
    }
}
