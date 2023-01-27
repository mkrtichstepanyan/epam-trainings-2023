package homework_4.TatevKocharyan.chapter6;

public class BoxParameterized {
    double width;
    double height;
    double depth;

    BoxParameterized(double w, double h, double d) {
        //System.out.println("Constructoring Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    void volume() {
        System.out.println("Volume is");
        System.out.println(width * height * depth);
    }

    double volume1() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}