package homework_4.Vazgen_Harutyunyan.chapter_6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // initialize each box
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // get volume of first box
        vol = myBox1.volume2();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = myBox2.volume2();
        System.out.println("Volume is " + vol);
    }
}
