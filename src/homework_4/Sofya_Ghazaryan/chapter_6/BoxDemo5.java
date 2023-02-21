package homework_4.Sofya_Ghazaryan.chapter_6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.returnVolume();
        System.out.println("Volume is " + vol);

        vol = myBox2.returnVolume();
        System.out.println("Volume is " + vol);
    }
}
