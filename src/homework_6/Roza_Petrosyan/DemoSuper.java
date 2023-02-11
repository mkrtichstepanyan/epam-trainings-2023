package homework_6.Roza_Petrosyan;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 myBox1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 myBox2 = new BoxWeight2(2, 3, 4, 0.076);
        BoxWeight2 myBox3 = new BoxWeight2();
        BoxWeight2 myCube = new BoxWeight2(3, 2);
        BoxWeight2 myClone = new BoxWeight2(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is: " + vol);
        System.out.println("Weight of myBox1 is: " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is: " + vol);
        System.out.println("Weight of myBox2 is: " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is: " + vol);
        System.out.println("Weight of myBox3 is: " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume of myClone is: " + vol);
        System.out.println("Weight of myClone is: " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume of myCube is: " + vol);
        System.out.println("Weight of myCube is: " + myCube.weight);
        System.out.println();

    }
}
