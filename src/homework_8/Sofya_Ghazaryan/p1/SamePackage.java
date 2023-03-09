package homework_8.Sofya_Ghazaryan.p1;

public class SamePackage {
    public SamePackage() {

        Protection p = new Protection();
        System.out.println("Same package constructor.");
        System.out.println("n = " + p.n);

//        class only
//        System.out.println("n_pri = "4 + n_pri);


        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }


}
