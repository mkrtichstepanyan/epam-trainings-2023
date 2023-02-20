package homework_6.Gevorg_Martirosian;

public class BoxWeight3 extends Box{
    double weight;

    public BoxWeight3(BoxWeight ob, double weight) {
        super(ob);
        this.weight = weight;
    }

    public BoxWeight3(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight3(Shipment ob) {
        super();
        this.weight = -1;
    }

    public BoxWeight3(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    public BoxWeight3() {
        super();
        this.weight = -1;
    }
}
