package homework_4.Diana_Melkonyan.chapter7;

public class Box {
    double width;
    double height;
    double depth;

    //Notice this constructor.It takes an object of type Box.
    Box(Box ob) {// pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }


    //This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    //constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; //an uninitialized
        depth = -1; //box
    }


    //constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    //compute return volume
    double volume() {
        return width * height * depth;
    }


}
