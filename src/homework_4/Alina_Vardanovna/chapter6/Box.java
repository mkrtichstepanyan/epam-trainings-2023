package homework_4.Alina_Vardanovna.chapter6;

public class Box {

    public double width;
    public double height;
    public double depth;
    public final int WARRANTY_YEAR = 1;
    // final գլոբալ փոփոխականների անունները ընդունված է դնել մեծատառ:

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    double volume() {
        return width * height * depth;
    }


    public boolean equalTo(Box box) {
        return box.width == this.width
                && box.height == this.height
                && box.depth == this.depth;
    }

}
