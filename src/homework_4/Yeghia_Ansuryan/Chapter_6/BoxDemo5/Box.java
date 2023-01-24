package homework_4.Yeghia_Ansuryan.Chapter_6.BoxDemo5;

public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
