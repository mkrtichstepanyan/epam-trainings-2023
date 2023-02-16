package homework_6.garik_gharibyan.chapter_8;

class Box {
    double width;
    double height;
    double depth;

    Box(Box o) {
        width = o.width;
        height = o.height;
        depth = o.depth;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double value() {
        return width * height * depth;
    }
}

class BoxWeight extends Box{

    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {

        BoxWeight boxWeight1 = new BoxWeight(10,20,15,34.3);
        BoxWeight boxWeight2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = boxWeight1.value();
        System.out.println("Value of boxWeight1 is " + vol);
        System.out.println("Weight of boxWeight1 is " + boxWeight1.weight);
        System.out.println();

        vol = boxWeight2.value();
        System.out.println("Value of boxWeight2 is " + vol);
        System.out.println("Weight of boxWeight2 is " + boxWeight2.weight);
    }
}
