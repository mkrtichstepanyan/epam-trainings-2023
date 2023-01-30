package homework_4.Nelli_Poghosyan.Chapter_6;

public class Box5 {
    double width;
    double height;
    double depth;

    //compute and return volume
    double volume() {
        return width * height * depth;
    }

    //set dimension of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
}
