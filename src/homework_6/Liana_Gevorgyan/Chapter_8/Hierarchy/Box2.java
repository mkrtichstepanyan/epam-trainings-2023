package homework_6.Liana_Gevorgyan.Chapter_8.Hierarchy;
//Extend BoxWeight to include shipping costs
class Box2 {
    private double width;
    private double height;
    private double depth;
    //Construct-clone of an object
    Box2(Box2 ob){ // pass object to constructor
        width =ob.width;
        height= ob.height;
        depth= ob.depth;
    }
    //Constructor used when all dimesions specified
    Box2 (double w, double h, double d){
        width = w;
        height= h;
        depth = d;
    }
    // constructor used when no dimensions specified
    Box2() {
        width = -1;  // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box
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
//add weight.
class BoxWeight extends Box2 {
    double weight;//weight of box

    //construct clone of an object
    BoxWeight(BoxWeight ob) {// pass object to constructor
        super(ob);
        weight = ob.weight;
    }

    //default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    //Constructror used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

    public BoxWeight(double w, double h, double d, double m) {
    }
}
// Add shipping costs.
class Shipment extends BoxWeight {
    double cost;
    // construct clone of an object
    Shipment(Shipment ob) { // pass object to constructor
        super(ob);
        cost = ob.cost;
    }
    // constructor when all parameters are specified
    Shipment(double w, double h, double d,
             double m, double c) {
        super(w, h, d, m); // call superclass constructor
        cost = c;
    }
    // default constructor
    Shipment() {
        super();
        cost = -1; }
    // constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c; 
    }
}
