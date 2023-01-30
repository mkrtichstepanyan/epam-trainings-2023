package homework_4.Liana_Gevorgyan.chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {
        //declare,allocate, and initialize Box objects
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        //Get volume of first box
        vol = mybox1.volume3();
        System.out.println("volume is " + vol);

        //Get volume of second box
        vol = mybox2.volume3();
        System.out.println("volume is " + vol);
    }
}
