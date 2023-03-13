package homework_8.TatevKocharyan.p2;

import homework_8.TatevKocharyan.p1.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("derived other package constructors");
        //class or package only
        //System.out.println("n="+n);
        //class  only
        //System.out.println("n_pri="+n_private);
        System.out.println("n_pro="+n_protected);
        System.out.println("n_pub="+n_public);
    }
}