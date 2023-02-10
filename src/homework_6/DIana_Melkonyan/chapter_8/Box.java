package homework_6.DIana_Melkonyan.chapter_8;

public class Box {
    double width;
    double height;
    double depth;

    //construct clone of an object
    Box(Box ob) { //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
