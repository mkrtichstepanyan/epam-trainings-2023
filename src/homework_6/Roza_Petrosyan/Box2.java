package homework_6.Roza_Petrosyan;

public class Box2 {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Box2(Box2 ob) {  // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box2() {
        width = -1;   // use -1 to indicate
        height = -1;  // an uninitialized box
        depth = -1;
    }

    // constructor used when cube is created
    Box2(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
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

    BoxWeight2() {
        super();
        weight = -1;
    }

    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight2{
    double cost;

    public Shipment(BoxWeight2 ob, double cost) {
        super(ob);
        this.cost = cost;
    }

    public Shipment(double w, double h, double d, double m, double cost) {
        super(w, h, d, m);
        this.cost = cost;
    }

    public Shipment(double cost) {
        this.cost = cost;
    }

    public Shipment(double len, double m, double cost) {
        super(len, m);
        this.cost = cost;
    }
}
