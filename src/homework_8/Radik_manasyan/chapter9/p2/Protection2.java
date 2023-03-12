package homework_8.Radik_manasyan.chapter9.p2;

import homework_8.Hovhannes_Gspeyan.chapter_9.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");
        //доступно только для данного класса или пакета
        //System.out.println("n = " + n);
        //доступно только для данного класса
        //System.out.println("nPri = " + nPri);
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
