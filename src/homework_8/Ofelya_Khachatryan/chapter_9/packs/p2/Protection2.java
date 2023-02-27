package homework_8.Ofelya_Khachatryan.chapter_9.packs.p2;

import homework_8.Ofelya_Khachatryan.chapter_9.packs.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("derived other package constructor");

//        class only
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
