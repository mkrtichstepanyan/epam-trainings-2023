package homework_6.Araksya_Ghazaryan.chapter_8;

public class Shipment extends BoxWeight3 {
    double cost;

    Shipment (Shipment ob) {
        super();
        cost = ob.cost;
    }
    Shipment (double w, double h, double d, double m, double c) {
        super(w, h,d, m);
        cost = c;
    }
    Shipment (){
        super();
        cost = -1;
    }
    Shipment (double len, double m, double c){
        super(len, m);
        cost = c;
    }
}