package homework_6.Argishti_Mesropyan.chapter_8;

public class Box2Weight extends Box2 {
    double weight;

    Box2Weight(Box2Weight ob) {
        super(ob);
        weight = ob.weight;
    }

    Box2Weight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Box2Weight() {
        super();
        weight = -1;
    }

    Box2Weight(double len, double m) {
        super(len);
        weight = m;
    }
}
