package homework_4.Yeghia_Ansuryan.Chapter_7.OverloadCons2;

public class OverloadCons2 {
    public static void main(String[] args) {

        Box mybox1 = new Box (10, 20, 15);
        Box mybox2 = new Box ();
        Box mycube = new Box (7);

        Box myclone = new Box();

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);

        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
