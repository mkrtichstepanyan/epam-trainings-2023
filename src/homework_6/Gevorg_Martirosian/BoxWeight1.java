package homework_6.Gevorg_Martirosian;

public class BoxWeight1 extends Box{
    double weight;

    public BoxWeight1(BoxWeight1 ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public BoxWeight1(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    BoxWeight1(){
        super();
        weight = -1;
    }

    public BoxWeight1(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}
