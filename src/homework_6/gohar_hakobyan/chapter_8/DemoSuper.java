package homework_6.gohar_hakobyan.chapter_8;

public class DemoSuper {
    public static void main(String[] args) {

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume mybox1 is " + vol);
        System.out.println("Weight mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume mybox2 is " + vol);
        System.out.println("Weight mybox2 is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume mybox3 is " + vol);
        System.out.println("Weight mybox3 is " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume myclone is " + vol);
        System.out.println("Weight myclone is " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume mycube is " + vol);
        System.out.println("Weight mycube is " + mycube.weight);
        System.out.println();

    }
}