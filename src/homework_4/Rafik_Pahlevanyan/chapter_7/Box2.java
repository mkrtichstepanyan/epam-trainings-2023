package homework_4.Rafik_Pahlevanyan.chapter_7;

/*
    Here, Box defines three constructors to initialize
    the dimensions of a box various ways.
 */
public class Box2 {
    double width;
    double height;
    double depth;

    //constructor used when all dimensions specified
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    //Notice this constructor, It takes an object of type Box
    Box2(Box2 ob) {//pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor used when no dimensions specified
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor used when cube is created
    Box2(double len) {
        width = height = depth = len;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
