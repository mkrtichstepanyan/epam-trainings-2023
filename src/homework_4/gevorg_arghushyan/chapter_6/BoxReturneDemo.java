package homework_4.gevorg_arghushyan.chapter_6;

public class BoxReturneDemo {
    public static void main(String[] args) {
        BoxReturn myBox1 = new BoxReturn();
        BoxReturn myBox2 = new BoxReturn();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volume();
        System.out.println("the volume is " + vol);

        vol = myBox2.volume();
        System.out.println("the volume is " + vol);
    }
}
