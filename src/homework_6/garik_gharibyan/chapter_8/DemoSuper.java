package homework_6.garik_gharibyan.chapter_8;


class Box2 {
    private double wight;
    private double height;
    private double depth;

    Box2() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    Box2(Box2 ob) {
        wight = ob.wight;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    Box2(double len) {
        wight = height = depth = len;
    }

    double value() {
        return wight * height * depth;
    }
}

class BoxWeight2 extends Box2 {
    double weight;

    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }

    BoxWeight2() {
        super();
        weight = -1;
    }

}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 myBox1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 myBox2 = new BoxWeight2(2, 3, 4, 0.076);
        BoxWeight2 myBox3 = new BoxWeight2();
        BoxWeight2 myCube = new BoxWeight2(3, 2);
        BoxWeight2 myClone = new BoxWeight2(myBox1);
        double vol;

        vol = myBox1.value();
        System.out.println("Value of myBox1 is: " + vol);
        System.out.println("Weight of myBox1 is: " + myBox1.weight);
        System.out.println();

        vol = myBox2.value();
        System.out.println("Value of myBox2 is: " + vol);
        System.out.println("Weight of myBox2 is: " + myBox2.weight);
        System.out.println();

        vol = myBox3.value();
        System.out.println("Value of myBox3 is: " + vol);
        System.out.println("Weight of myBox3 is: " + myBox3.weight);
        System.out.println();

        vol = myCube.value();
        System.out.println("Value of myBox4 is: " + vol);
        System.out.println("Weight of myBox4 is: " + myCube.weight);
        System.out.println();

        vol = myClone.value();
        System.out.println("Value of myBox5 is: " + vol);
        System.out.println("Weight of myBox5 is: " + myClone.weight);
        System.out.println();
    }
}
