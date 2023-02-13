package homework_6.TatevKocharyan.box;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 20, 3);
        BoxWeight mybox2 = new BoxWeight(10, 47, 2, 32);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 6);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volum();
        System.out.println("volume of my box1;" + vol);
        System.out.println("Weight of mybox1" + mybox1.weight);
        System.out.println();

        vol = mybox2.volum();
        System.out.println(vol);
        System.out.println("Weight of mybox1" + mybox2.weight);

        vol = mybox3.volum();
        System.out.println("Volume of mybox3 is : " + vol);
        System.out.println(mybox3.weight);
        System.out.println();

        vol = mycube.volum();
        System.out.println("mycube vol" + vol);
        System.out.println("mycube weight" + mycube.weight);

        vol = myclone.volum();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("myclone weight" + myclone.weight);


    }
}