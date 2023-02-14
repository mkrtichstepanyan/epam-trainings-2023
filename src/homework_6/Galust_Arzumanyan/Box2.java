package homework_6.Galust_Arzumanyan;

class Box2 {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
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

    // constructor used when cube is created.
    Box2(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {

        return width * height * depth;
    }
}
