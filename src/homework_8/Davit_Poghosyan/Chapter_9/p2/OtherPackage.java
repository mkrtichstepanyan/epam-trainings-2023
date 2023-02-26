package homework_8.Davit_Poghosyan.Chapter_9.p2;

import homework_8.Davit_Poghosyan.Chapter_9.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        homework_8.Davit_Poghosyan.Chapter_9.p1.Protection p =
                new Protection();
        System.out.println("other package constructor");

        System.out.println("n_pub = " + p.n_pub);

    }
}
