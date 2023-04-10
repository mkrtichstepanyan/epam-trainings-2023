package homework_8.TatevKocharyan.p1;

public class Derived extends Protection {
    Derived(){
        System.out.println("derived constructor");
        System.out.println("n="+n);
        //System.out.println("n_pri="4+n_private");
        System.out.println("n_pro="+n_protected);
        System.out.println("n_pub="+n_public);
    }
}
