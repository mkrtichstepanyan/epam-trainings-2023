package homework_4.Qnarik_Khachatryan.chapter_6;

class BoxWithParamConstructor {
    double width;
    double height;
    double depth;

    //constructor for BoxWithParamConstructor
    BoxWithParamConstructor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
