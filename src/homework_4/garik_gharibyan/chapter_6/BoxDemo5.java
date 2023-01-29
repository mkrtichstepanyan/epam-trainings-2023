package homework_4.garik_gharibyan.chapter_6;

class Box5 {
    double wight;
    double height;
    double depth;

    double value() {
        return (wight * height * depth);
    }

    void setDim(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {

        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.value();
        System.out.println("Value is " + vol);

        vol = myBox2.value();
        System.out.println("Value is " + vol);
    }
}
