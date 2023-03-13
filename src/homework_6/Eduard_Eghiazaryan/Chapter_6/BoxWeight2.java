package homework_6.Eduard_Eghiazaryan.Chapter_6;


class BoxWeight2 extends Box1 {
    double weight;

    BoxWeight2(BoxWeight2 ob2) {
        super(ob2);
        weight = ob2.weight;
    }

    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight2() {
        super();
        weight = -1;
    }

    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}