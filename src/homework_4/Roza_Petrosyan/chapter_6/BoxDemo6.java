package homework_4.Roza_Petrosyan.chapter_6;

public class BoxDemo6 {
    public static void main(String[] args) {
        // declare, allocate and initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        // get volume of first box
        vol = mybox1.volume2();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume2();
        System.out.println("Volume is " + vol);
    }
}
