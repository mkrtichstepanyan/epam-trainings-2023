package homework_8.aram_mehrabyan.p1;

public class SamePackage {
    SamePackage(){
        Protection p=new Protection();
        System.out.println("same package constructor");
        System.out.println("n= " + p.n);
        // System.out.println("n_pri= "+p.n_pri);
        System.out.println("n_pro= " + p.n_pro);
        System.out.println("n_pub= " + p.n_pub);
    }
}
