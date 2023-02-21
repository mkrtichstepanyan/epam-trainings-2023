package homework_7.Anna_Manukyan.chapter_8.pi;

public class SamePackage {
    public SamePackage() {
        Protection p = new Protection();
        System.out.println("Derived other package constructor");
        System.out.println("n = "+p.n);
//        System.out.println("n_pri =  " + p.n_pri);
        System.out.println("n_pro =  " + p.n_pro);
        System.out.println("n_pub =  " + p.n_pub);
    }
}
