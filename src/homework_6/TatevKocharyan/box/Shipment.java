package homework_6.TatevKocharyan.box;

public class Shipment extends BoxWeight {
    double cost;

    Shipment() {
        super();
        cost = -1;
    }

    public Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    public Shipment(Shipment ob, double c) {
        super(ob);
        cost = c;
    }

    public Shipment(double c) {
        cost = c;
    }

    public Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}