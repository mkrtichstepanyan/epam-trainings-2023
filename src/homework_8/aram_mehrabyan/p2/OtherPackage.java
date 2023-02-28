package homework_8.aram_mehrabyan.p2;

public class OtherPackage {
    OtherPackage() {
        homework_8.aram_mehrabyan.p1.Protection p = new homework_8.aram_mehrabyan.p1.Protection();
        System.out.println(" other package constructor");
        // System.out.println("n= "+p.n);
        //System.out.println("n_pri= "+p.n_pri);
        // System.out.println("n_pro= "+p.n_pro);
        System.out.println("n_pub= " + p.n_pub);
    }
}
