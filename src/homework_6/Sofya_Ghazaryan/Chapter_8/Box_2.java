package homework_6.Sofya_Ghazaryan.Chapter_8;

public class Box_2 {
    private double width;
    private double height;
    private double depth;

    Box_2(Box_2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box_2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box_2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box_2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
