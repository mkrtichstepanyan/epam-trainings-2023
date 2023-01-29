package homework_4.garik_gharibyan.chapter_6;

class Box6 {
    double wight;
    double height;
    double depth;

    Box6() {
        System.out.println("Constructing Box ");
        wight = 10;
        height = 10;
        depth = 10;

    }

    double value() {
        return wight * height * depth;
    }

}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6();
        Box6 myBox2 = new Box6();
        double vol;

        vol = myBox1.value();
        System.out.println("Value is " + vol);

        vol = myBox2.value();
        System.out.println("Value is " + vol);
    }
}
