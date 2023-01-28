package homework_4.Davit_Poghosyan.Chapter_6;

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

    double volume() {
        return width * height * depth;
    }
}
