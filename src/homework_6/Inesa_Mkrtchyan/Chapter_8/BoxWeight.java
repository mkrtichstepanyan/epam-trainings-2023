package homework_6.Inesa_Mkrtchyan.Chapter_8;

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
//        width = w;
//        height = h;
//        depth = d;
        super(w, h, d);
        weight = m;
    }
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
    BoxWeight(){}
}

