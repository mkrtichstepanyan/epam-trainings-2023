package homework_6.Armen_Martirosyan.Chapter_8;

public class BoxWeight3 extends Box2 {
    double weight;

    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    public BoxWeight3() {
        super();
        weight = -1;
    }

    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}
