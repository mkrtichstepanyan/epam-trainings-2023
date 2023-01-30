package homework_4.Nona_Asatryan.chapter_7;

public class OverloadCons {
    public static void main(String[] args) {

        // create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);   // create copy of mybox1

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
