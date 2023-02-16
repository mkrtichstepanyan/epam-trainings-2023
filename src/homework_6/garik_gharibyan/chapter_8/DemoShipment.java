package homework_6.garik_gharibyan.chapter_8;

class Box3 {
    private double wight;
    private double height;
    private double dept;

    Box3() {
        wight = -1;
        height = -1;
        dept = -1;
    }

    Box3(double w, double h, double d) {
        wight = w;
        height = h;
        dept = d;
    }

    Box3(double len) {
        wight = height = dept = len;
    }

    Box3(Box3 ob) {
        wight = ob.wight;
        height = ob.height;
        dept = ob.dept;
    }

    double value() {
        return wight * height * dept;
    }
}

class BoxWeight3 extends Box3 {
    double weight;

    BoxWeight3() {
        super();
        weight = -1;
    }

    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }

    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }
}

class Shipment extends BoxWeight3 {
    double cost;

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
}


public class DemoShipment {

    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.value();
        System.out.println("Value of shipment1 is: " + vol);
        System.out.println("Weight of shipment1 is: " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.value();
        System.out.println("Value of shipment2 is: " + vol);
        System.out.println("Weight of shipment2 is: " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
