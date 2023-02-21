package homework_7.Anna_Manukyan.chapter_8.p2;

import homework_7.Anna_Manukyan.chapter_8.pi.Protection;

public class OtherPackage {
    public OtherPackage() {
        homework_7.Anna_Manukyan.chapter_8.pi.Protection p = new Protection();
        System.out.println("Some package constructor");
//        System.out.println("n = "+p.n);
//        System.out.println("n_pri =  " + p.n_pri);
//        System.out.println("n_pro =  " + p.n_pro);
        System.out.println("n_pub =  " + p.n_pub);
    }
}
