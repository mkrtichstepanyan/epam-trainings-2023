package homework_4.gohar_hakobyan.chapter_6;

public class BoxDemo3 {
    public static void main(String[] args) {
        double vol;

        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.volume();
        myBox2.volume();


    }
}
