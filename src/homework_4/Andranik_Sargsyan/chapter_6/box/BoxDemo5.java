package homework_4.Andranik_Sargsyan.chapter_6.box;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.setDim(10, 20, 25);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.retVolume();
        System.out.println("Volume is: " + vol);

        vol = myBox2.retVolume();
        System.out.println("Volume is: " + vol);
    }
}
