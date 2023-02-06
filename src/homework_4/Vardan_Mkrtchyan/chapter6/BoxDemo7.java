package homework_4.Vardan_Mkrtchyan.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        double vol;

        vol = myBox1.volume1();
        System.out.println("Volume: " + vol);

        vol = myBox2.volume1();
        System.out.println("Volume: " + vol);

    }
}
