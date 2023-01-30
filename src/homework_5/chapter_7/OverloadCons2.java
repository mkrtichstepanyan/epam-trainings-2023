package homework_5.chapter_7;

/**
 * Test Box2
 */
public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10,20,15);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);
        Box2 myClone = new Box2(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        vol = myCube.volume();
        System.out.println("Volume of cube is " + vol);

        vol = myClone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
