package homework_6.Radik_Manasyan.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 myBox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 myBox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 myBox3 = new BoxWeight1();
        BoxWeight1 myCube = new BoxWeight1(3, 2);
        BoxWeight1 myClone = new BoxWeight1(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);
        System.out.println("Вес myBox2 равен " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Объем myBox3 равен " + vol);
        System.out.println("Вес myBox3 равен " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Объем myClone равен " + vol);
        System.out.println("Вес myClone равен " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Объем myCube равен " + vol);
        System.out.println("Вес myCube равен " + myCube.weight);
        System.out.println();
    }
}
