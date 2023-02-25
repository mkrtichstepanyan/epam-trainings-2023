package homework_8.araksya_ghazaryan.chapter_9.p2;

import homework_8.araksya_ghazaryan.chapter_9.p1.Protection;
public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("other packege constructor");
        System.out.println("n_pub " + p.n_pub );
    }
}
