
package homework_6.Sofya_Ghazaryan.Chapter_8;

public class BoxWeight_2 extends Box_2 {
    double weight;

    BoxWeight_2(BoxWeight_2 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight_2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight_2() {
        super();
        weight = -1;
    }

    BoxWeight_2(double len, double m) {
        super(len);
        weight = m;
    }
}
