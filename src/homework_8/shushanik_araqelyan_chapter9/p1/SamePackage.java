package homework_8.shushanik_araqelyan_chapter9.p1;

import homework_8.shushanik_araqelyan_chapter9.p1.Protection;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
