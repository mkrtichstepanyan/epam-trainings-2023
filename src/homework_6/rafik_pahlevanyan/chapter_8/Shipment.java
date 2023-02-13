package homework_6.rafik_pahlevanyan.chapter_8;

//Add shipping costs
class Shipment extends BoxWeight2 {
    double cost;

    //construct clone of an object
    Shipment(Shipment ob2) {    //pass object to constructor
        super(ob2);
        cost = ob2.cost;
    }

    //constructor when all parameters are specified
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);  //call superclass constructor
        cost = c;
    }

    //default constructor
    Shipment() {
        super();
        cost = -1;
    }

    //constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}