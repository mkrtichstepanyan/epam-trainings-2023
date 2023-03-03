package homework_6.Arsen_Kazaryan.chapter_8;

import homework_6.Karen_Sargsyan.Chapter_8.Multilevel.Shipment;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    public BoxWeight() {

    }

    public BoxWeight(double len, double m) {

    }

    public BoxWeight(Shipment ob) {


    }
}
