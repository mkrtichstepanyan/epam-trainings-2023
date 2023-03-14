package homework_8.TatevKocharyan.p2;

import homework_8.TatevKocharyan.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p=new Protection();
        System.out.println("other package constructor");
        //class or package only
        //System.out.println("n="+n);
        //class  only
        //System.out.println("n_pri="+n_private);
        //class or subclass or package only
        //System.out.println("n_pro="+p.n_protected);
        System.out.println("n_pub="+p.n_public);
    }
}
