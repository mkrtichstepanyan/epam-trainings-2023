package homework_8.Diana_Melkonyan.p2;

import homework_8.Diana_Melkonyan.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("other packeg constructor");

        //class or package only
       // System.out.println("n = "+ p.n);

        //class or package only
        // System.out.println("n_pri = "+ p.n_pri);

        //class or package only
        // System.out.println("n_pro = "+ p.n_pro);

        System.out.println("n_pub =" + p.n_pub);
    }
}
