package homework_4.Robert_Nazaryan.Chapter_7;

public class Box2 {

    double width;
    double height;
    double depth;

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
