package homework_4.garik_gharibyan.chapter_6;

class Box4 {
    double wight;
    double height;
    double depth;

    double value() {
        return (wight * height * depth);
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 myBox1 = new Box4();
        Box4 myBox2 = new Box4();
        double vol;

        myBox1.wight = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.wight = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.value();
        System.out.println("Value is " + vol);

        vol = myBox2.value();
        System.out.println("Value is " + vol);
    }
}
