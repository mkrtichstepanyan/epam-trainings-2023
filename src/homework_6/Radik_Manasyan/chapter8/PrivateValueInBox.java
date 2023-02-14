package homework_6.Radik_Manasyan.chapter8;

public class PrivateValueInBox {
    private double width;
    private double height;
    private double depth;

    PrivateValueInBox(PrivateValueInBox ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    PrivateValueInBox(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
    }

    PrivateValueInBox() {
        width = -1;
        height = -1;
        depth = -1;
    }

    PrivateValueInBox(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight1 extends PrivateValueInBox {
    double weight;

    BoxWeight1(BoxWeight1 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d, m);
        weight = m;
    }

    BoxWeight1() {
        super();
        weight = -1;
    }

    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}
