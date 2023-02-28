package homework_8.Yeghia_Ansuryan.Chapter_9.P1;

public class SamPackage {
    SamPackage() {
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
//        class only;
//        System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
