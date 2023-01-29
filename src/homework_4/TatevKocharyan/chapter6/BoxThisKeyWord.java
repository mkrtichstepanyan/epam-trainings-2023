package homework_4.TatevKocharyan.chapter6;

public class BoxThisKeyWord {
    double width;
    double height;
    double depth;

    BoxThisKeyWord(double width, double height, double depth) {
        System.out.println("Constructoring Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
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