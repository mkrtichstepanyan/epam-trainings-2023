package homework_8.Radik_manasyan.chapter9.p2;

import chapter9.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        chapter9.p1.Protection p = new Protection();
        System.out.println("Конструктор из другого пакета");
        //доступно только для данного класса или пакета
        //System.out.println("n = " + p.n);

        //доступно только для данного класса
        //System.out.println("nPri = " + p.nPri);

        //доступно только для данного класса подкласса или пакета
        //System.out.println("nPro = " + p.nPro);

        System.out.println("nPub = " + p.nPub);
    }
}
