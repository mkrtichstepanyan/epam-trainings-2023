package homework_4.Andranik_Sargsyan.chapter_6.box;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.weight = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.weight = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.volume();
        myBox2.volume();
    }
}