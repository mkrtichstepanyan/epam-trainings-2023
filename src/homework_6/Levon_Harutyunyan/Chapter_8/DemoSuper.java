package homework_6.Levon_Harutyunyan.Chapter_8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 myBox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 myBox2 = new BoxWeight1(2, 3, 4, 0.76);
        BoxWeight1 myBox3 = new BoxWeight1();
        BoxWeight1 myCube = new BoxWeight1(2, 3);
        BoxWeight1 myClone = new BoxWeight1(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + myBox1.weight);
        System.out.println();
        vol = myBox2.volume();
        System.out.println("Volume mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + myBox2.weight);
        System.out.println();
        vol = myBox3.volume();
        System.out.println("Volume mybox3 is " + vol);
        System.out.println("Weight of mybox2 is " + myBox3.weight);
        System.out.println();
        vol = myClone.volume();
        System.out.println("Volume myclone is " + vol);
        System.out.println("Weight of myclone is " + myClone.weight);
        System.out.println();
        vol = myCube.volume();
        System.out.println("Volume mycube is " + vol);
        System.out.println("Weight of mycube is " + myCube.weight);
    }
}
