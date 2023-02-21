package homework_6.rafik_pahlevanyan.chapter_8;

//Here, Box is extended to include weight.
class BoxWeight extends Box {
    double weight;  //weight of box

    //constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}