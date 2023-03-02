package homework_8.gevorg_arghushyan_chapter_9.p2;

import homework_8.gevorg_arghushyan_chapter_9.p1.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("Derived class constructor from another package");
        //Just class or package.
        //System.out.println("n = " + n);
        //Just class
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
