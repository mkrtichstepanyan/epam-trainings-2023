package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.p2;


import homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.p1.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("derived other package constructor");
        System.out.println("n_pro = "  + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

