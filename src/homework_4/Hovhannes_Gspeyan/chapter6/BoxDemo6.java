package homework_4.Hovhannes_Gspeyan.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        vol = myBox1.computeVolume();
        System.out.println("Volume is " + vol);

        vol = myBox2.computeVolume();
        System.out.println("Volume is " + vol);
    }
}
