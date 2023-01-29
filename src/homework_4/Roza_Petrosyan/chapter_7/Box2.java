package homework_4.Roza_Petrosyan.chapter_7;

// Here Box2 allows one object to initialize another.
public class Box2 {
    double width;
    double height;
    double depth;

    // Notice this constructor. It takes an object of type Box2.
    Box2(Box2 ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box2(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
