package homework_8.Inesa_Mkrtchyan.Chapter_9.P2;

import homework_8.Inesa_Mkrtchyan.Chapter_9.P1.Protection;

class OtherPackage {
    OtherPackage(){
        homework_8.Inesa_Mkrtchyan.Chapter_9.P1.Protection p = new Protection();
        System.out.println("other package constructor");
//        System.out.println("n  = " + p.n);
//        System.out.println("n_pri = " + p.n_pri);
//        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
