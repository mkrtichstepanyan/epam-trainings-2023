package homework_6.Armen_Martirosyan.Chapter_8;

public class Shipment extends BoxWeight3 {
    double cost;

    public Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    public Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    public Shipment() {
        super();
        cost = -1;
    }

    public Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
