package homework_6.Alina_Mkhoyan.chapter_8;

class Shipment extends BoxWeight2 {
    double cost;

    Shipment(Shipment ob2) {
        super(ob2);
        cost = ob2.cost;
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
        cost = c;
    }
}