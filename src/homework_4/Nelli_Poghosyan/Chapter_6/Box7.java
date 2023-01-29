package homework_4.Nelli_Poghosyan.Chapter_6;

public class Box7 {
    double width;
    double height;
    double depth;
    //constructor
    Box7(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
