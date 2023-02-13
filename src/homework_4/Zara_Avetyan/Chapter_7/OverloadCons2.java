package homework_4.Zara_Avetyan.Chapter_7;

public class OverloadCons2 {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycupe = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycupe.volume();
        System.out.println("Volume of mycupe is " + vol);

        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}
