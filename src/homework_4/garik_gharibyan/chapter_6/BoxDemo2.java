package homework_4.garik_gharibyan.chapter_6;

import java.util.Random;

class Box2 {
    double wight;
    double height;
    double depth;
}

public class BoxDemo2 {

    public static void main(String[] args) {
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();
        double vol;

        myBox1.wight = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.wight = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.depth * myBox1.height * myBox1.wight;
        System.out.println("Volume is myBox1 is " + vol);

        vol = myBox2.depth * myBox2.height * myBox2.wight;
        System.out.println("Volume is myBox2 is " + vol);
    }
}
