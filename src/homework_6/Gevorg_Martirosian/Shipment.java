package homework_6.Gevorg_Martirosian;

public class Shipment extends BoxWeight3{
    double cost;

    public Shipment(Shipment ob) {
        super(ob);
        this.cost = ob.cost;
    }

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public Shipment() {
        super();
        this.cost = -1;
    }

    public Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}
