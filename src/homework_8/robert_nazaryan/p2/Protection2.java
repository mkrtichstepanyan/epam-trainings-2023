package homework_8.robert_nazaryan.p2;

public final class Protection2 extends homework_8.robert_nazaryan.p1.Protection{
    Protection2 (){
        System.out.println("derived other package constructor");

        //class or package only
        //System.out.println("n = " + n);

        //class only
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
