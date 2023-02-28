package homework_8.Alina_Mkhoyan.chapter_9.p2;

import homework_8.Alina_Mkhoyan.chapter_9.p1.Protection;

public class OtherPackage {
    public OtherPackage() {
        homework_8.Alina_Mkhoyan.chapter_9.p1.Protection p = new Protection();
        System.out.println("Some package constructor");
//        System.out.println("n = "+p.n);
//        System.out.println("n_pri =  " + p.n_pri);
//        System.out.println("n_pro =  " + p.n_pro);
        System.out.println("n_pub =  " + p.n_pub);
    }
}