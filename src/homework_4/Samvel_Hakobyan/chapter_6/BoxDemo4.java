package homework_4.Samvel_Hakobyan.chapter_6;

public class BoxDemo4 {

    public static void main(String[] args) {


        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;


        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.Volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.Volume();
        System.out.println("Volume is " + vol);

    }
}
