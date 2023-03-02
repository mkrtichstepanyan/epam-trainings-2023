package homework_8.gevorg_arghushyan_chapter_9.p2;


import homework_8.gevorg_arghushyan_chapter_9.p1.Protection;

public class OtherPackage {

    OtherPackage (){
        Protection p = new Protection();
        System.out.println("Class constructor from another package");
        //Just package or class;
        //System.out.println("n = " + n);
        //Just class
        //System.out.println("n_pri = " + n_pri);
        //System.out.println("n_pro = " + n_pro);
        //System.out.println("n_pub = " + n_pub);
        System.out.println("n_pub = " + p.n_pub);
    }
}
