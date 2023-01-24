package homework_4.Ani_Barseghyan.chapter_6.BoxDemo4;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume is " + vol);
    }
}
