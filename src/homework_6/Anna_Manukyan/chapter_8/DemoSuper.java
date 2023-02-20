package homework_6.Anna_Manukyan.chapter_8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.5);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight box3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(2, 3);
        BoxWeight myClone = new BoxWeight(box1);
        double vol;

        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);
        System.out.println("Weight of box1 is " + box1.weight);
        System.out.println();

        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);
        System.out.println("Weight of box2 is " + box2.weight);
        System.out.println();

        vol = box3.volume();
        System.out.println("Volume of box3 is " + vol);
        System.out.println("Weight of box3 is " + box3.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);
        System.out.println("Weight of myCube is " + myCube.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume of myClone is " + vol);
        System.out.println("Weight of myClone is " + myClone.weight);
        System.out.println();
    }
}
