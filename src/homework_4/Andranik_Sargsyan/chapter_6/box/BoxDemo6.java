package homework_4.Andranik_Sargsyan.chapter_6.box;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        vol = myBox1.retVolume();
        System.out.println("Volume is: " + vol);
        vol = myBox2.retVolume();
        System.out.println("Volume is: " + vol);
    }
}
