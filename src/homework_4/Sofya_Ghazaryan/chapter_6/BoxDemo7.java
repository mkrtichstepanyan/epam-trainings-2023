package homework_4.Sofya_Ghazaryan.chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        Box myBox3 = new Box();

        double vol;

        vol = myBox1.returnVolume();
        System.out.println("Volume is " + vol);

        vol = myBox2.returnVolume();
        System.out.println("Volume is " + vol);

        vol = myBox3.returnVolume();
        System.out.println("Volume is " + vol);
    }
}
