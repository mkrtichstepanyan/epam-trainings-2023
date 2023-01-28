package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм myBox1 равен " + vol);

        vol = myBox2.volume();
        System.out.println("Oбъeм myBox2 равен " + vol);

        vol = myCube.volume();
        System.out.println("Oбъeм myCube равен " + vol);
    }
}
