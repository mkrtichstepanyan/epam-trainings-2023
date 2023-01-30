package homework_5.chapter_7;

/**
 * Test Box1
 */
public class OverloadCons {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1(10,20,15);
        Box1 myBox2 = new Box1();
        Box1 myCube = new Box1(7);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);
    }
}
