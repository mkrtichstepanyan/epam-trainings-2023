package homework_8.garik_gharibyan.chapter_9.p2;

import homework_8.garik_gharibyan.chapter_9.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();


        System.out.println("other package constructor");


//        class or package only
//        System.out.println("n = " + n);

//        class only
//        System.out.println("n_pri = " + n_pri);

//        class,subclass or package only
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
