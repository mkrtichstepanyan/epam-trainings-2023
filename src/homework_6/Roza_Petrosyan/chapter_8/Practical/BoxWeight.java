package homework_6.Roza_Petrosyan.chapter_8.Practical;

// here Box is extended to ed to include weight
class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
