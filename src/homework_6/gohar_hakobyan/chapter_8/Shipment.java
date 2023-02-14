package homework_6.gohar_hakobyan.chapter_8;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }


    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = -1;
    }

    double volume() {
        return width * height * depth;
    }

}
