package homework_4.Karen_Sargsyan.Chapter_7;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}
