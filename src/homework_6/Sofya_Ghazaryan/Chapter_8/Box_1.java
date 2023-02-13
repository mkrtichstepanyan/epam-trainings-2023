package homework_6.Sofya_Ghazaryan.Chapter_8;

public class Box_1 {
    private double width;
    private double height;
    private double depth;

    Box_1(Box_1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box_1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box_1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box_1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
