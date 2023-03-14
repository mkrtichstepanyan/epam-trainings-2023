package homework_8.Radik_manasyan.chapter9.p1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Кoнcтpyктop из того же самого пакета");
        System.out.println("n = " + p.n);
        //доступно только для класса
        //System.out.println("nPri = " + 4 + p.nPri);
        System.out.println("nPro = " + p.nPro);
        System.out.println("nPub = " + p.nPub);
    }
}
