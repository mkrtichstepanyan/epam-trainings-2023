package homework_6.Hovhannes_Gspeyan.chapter_8;

/**
 * demonstrates a multilayer hierarchy
 */
public class Shipment extends BoxWeight2{

    double cost;

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    public Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        this.cost = c;
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
