package homework_8.Roza_Petrosyan.Chapter_9.P2;

import homework_8.Roza_Petrosyan.Chapter_9.P1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("derived other package constructor");
//        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
