package homework_6.Qnarik_Khachatryan.chapter_8.multilevel_hierarchy;

// add shipping costs
class Shipment extends BoxWeight {
    double cost;

    //construct clone of an object
    Shipment(Shipment ob) { //pass object to constructor
        super(ob);
        cost = ob.cost;
    }

    //constructor when all parameters are specified
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); //call superclass constructor
        cost = c;
    }
}
