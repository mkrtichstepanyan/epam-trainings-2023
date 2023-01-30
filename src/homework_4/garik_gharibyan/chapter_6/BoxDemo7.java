package homework_4.garik_gharibyan.chapter_6;

class Box7 {
    double wight;
    double height;
    double depth;

    Box7(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    double value() {
        return wight * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 myBox1 = new Box7(10, 20, 15);
        Box7 myBox2 = new Box7(3, 6, 9);
        double vol;

        vol = myBox1.value();
        System.out.println("Value is " + vol);

        vol = myBox2.value();
        System.out.println("Value is " + vol);
    }


}
