package homework_6.Vahe_Vardanyan.Chapter_8;

public class Box {

    double widht;
    double height;
    double depth;

    Box(Box ob) {
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }


    Box(double w, double h, double d) {

        widht = w;
        height = h;
        depth = d;
    }

    Box() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        widht = height = depth = len;
    }

    double volume() {
        return widht * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        widht = w;
        height = h;
        depth = d;
        weight = m;
    }

}

class DemoBoxWeight {
    public static void main(String[] args) {

        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
        double vol;


        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Volume of mybox1 is " + mybox1.weight);
        System.out.println();


        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Volume of mybox2 is " + mybox2.weight);


    }
}

