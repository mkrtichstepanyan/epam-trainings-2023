package homework_6.Anna_Manukyan.chapter_8;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }

    public BoxWeight(BoxWeight ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
