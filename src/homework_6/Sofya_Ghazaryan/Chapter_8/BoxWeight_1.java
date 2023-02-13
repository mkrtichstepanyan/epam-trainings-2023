package homework_6.Sofya_Ghazaryan.Chapter_8;

public class BoxWeight_1 extends Box_1 {
    double weight;

    BoxWeight_1(BoxWeight_1 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight_1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight_1() {
        super();
        weight = -1;
    }

    BoxWeight_1(double len, double m) {
        super(len);
        weight = m;
    }
}
