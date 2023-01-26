package homework_4.Hovhannes_Abrahamyan.chapter_6;

public class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructoring Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
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