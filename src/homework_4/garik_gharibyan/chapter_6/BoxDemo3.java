package homework_4.garik_gharibyan.chapter_6;

class Box3 {
    double wight;
    double height;
    double depth;

    void value() {
        System.out.print("Value is ");
        System.out.println(wight * height * depth);

    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();

        myBox1.wight = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.wight = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.value();
        myBox2.value();
    }
}
