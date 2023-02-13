package homework_6.Qnarik_Khachatryan.chapter_8.box_weight;

//Here Box is extended to include weight.

class BoxWeight extends Box {
    double weight; //weight of box

    // constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
