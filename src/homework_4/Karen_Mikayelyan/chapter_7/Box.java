package homework_4.Karen_Mikayelyan.chapter_7;

public class Box {
    double width;
    double height;
    double depth;

    // This constructor takes an object of type Box.
    Box(Box ob) {         //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions specified.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions specified.
    Box() {
        width = -1;      // use -1 to indicate
        height = -1;     // an uninitialized
        depth = -1;      // box
    }

    // Constructor used when cube is created.
    Box(double len) {

        width = height = depth = len;
    }

    // compute and return volume
    double volume() {

        return width * height * depth;
    }
}
