package homework_8.shushanik_araqelyan_chapter9.p1;

import homework_8.shushanik_araqelyan_chapter9.p1.Protection;

public class Derived extends Protection {
    Derived(){
        System.out.println("derived constructor");
        System.out.println(" n = " + n);
        System.out.println("n_pro ="+ n_pro);
        System.out.println("n_pub ="+ n_pub);
    }

}
