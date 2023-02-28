package homework_8.Varsik_Pijoyan.chapter_9.PackagesAndInheritances.p2;

import homework_8.Varsik_Pijoyan.chapter_9.PackagesAndInheritances.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("other package constructor");
        System.out.println("n_pub = " + p.n_pub);
    }

}