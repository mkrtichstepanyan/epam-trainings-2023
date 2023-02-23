package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("derived constructor");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}