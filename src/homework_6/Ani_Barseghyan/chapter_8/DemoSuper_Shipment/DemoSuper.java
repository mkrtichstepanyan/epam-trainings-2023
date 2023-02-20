package homework_6.Ani_Barseghyan.chapter_8.DemoSuper_Shipment;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is " + vol);
        System.out.println("Weight of myBox3 is " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        ;
        System.out.println("Volume of myClone is " + vol);
        System.out.println("Weight of myClone is " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        ;
        System.out.println("Volume of myCube is " + vol);
        System.out.println("Weight of myCube is " + myCube.weight);
        System.out.println();
    }
}
