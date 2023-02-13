package chapter_8.Hovhannes_Abrahamyan.chapter_8.Multilevel;

class Shipment extends BoxWeight {
    double cost;

    public Shipment(BoxWeight ob, double cost) {
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
