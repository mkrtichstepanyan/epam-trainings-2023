package homework_6.Sofya_Ghazaryan.Chapter_8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight_1 myBox_1 = new BoxWeight_1(10, 20, 14, 34.3);
        BoxWeight_1 myBox_2 = new BoxWeight_1(2, 3, 4, 0.076);
        BoxWeight_1 myBox_3 = new BoxWeight_1();
        BoxWeight_1 myCube = new BoxWeight_1(3, 2);
        BoxWeight_1 myClone = new BoxWeight_1(myBox_1);
        double vol;

        vol = myBox_1.volume();
        System.out.println("Volume of myBox_1 is " + vol);
        System.out.println("Weight of myBox_1 is " + myBox_1.weight);
        System.out.println();

        vol = myBox_2.volume();
        System.out.println("Volume of myBox_2 is " + vol);
        System.out.println("Weight of myBox_2 is " + myBox_2.weight);
        System.out.println();

        vol = myBox_3.volume();
        System.out.println("Volume of myBox_3 is " + vol);
        System.out.println("Weight of myBox_3 is " + myBox_3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume of myClone is " + vol);
        System.out.println("Weight of myClone is " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);
        System.out.println("Weight of myCube is " + myCube.weight);
        System.out.println();
    }
}
