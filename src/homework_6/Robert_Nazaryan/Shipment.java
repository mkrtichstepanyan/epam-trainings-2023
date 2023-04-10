package homework_6.Robert_Nazaryan;

public class Shipment extends BoxWeight1 {
    double cost;

    //constructorwhen all parameters are specified
    Shipment(double w, double h, double d, double m, double c){
        super(w,h,d,m); // call superclass constructor
        cost = c;
    }
    //default constructor
    Shipment(){
        super();
        cost = -1;
    }
    //constructor used when cube is created
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
