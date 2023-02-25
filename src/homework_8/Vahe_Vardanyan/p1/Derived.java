package homework_8.Vahe_Vardanyan.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("derived constructor");
        System.out.println("n = " + n);

        //class only
       // System.out.println("n_pri = "4 + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
