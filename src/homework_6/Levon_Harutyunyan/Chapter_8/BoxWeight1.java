package homework_6.Levon_Harutyunyan.Chapter_8;

public class BoxWeight1  extends Box1 {
    double weight;

    BoxWeight1(BoxWeight1 ob1) {
        super();
        weight = ob1.weight;
    }

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight1() {
        super();
        weight = -1;
    }
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}
