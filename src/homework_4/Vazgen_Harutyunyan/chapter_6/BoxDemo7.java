package homework_4.Vazgen_Harutyunyan.chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {
        // declare, allocate and initialize Box objects
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        double vol;

        // get volume of first box
        vol = myBox1.volume2();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = myBox2.volume2();
        System.out.println("Volume is " + vol);
    }
}
