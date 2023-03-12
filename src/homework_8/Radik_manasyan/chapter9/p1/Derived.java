package homework_8.Radik_manasyan.chapter9.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Кoнcтpyктop подкласса");
        //доступно только для класса
        //System.out.println("nPri = " + 4 + nPri);
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
