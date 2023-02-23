package homework_6.rafik_pahlevanyan.chapter_8;

//A.java complete implementation of BoxWeight
public class Box1 {
    private double width;
    private double height;
    private double depth;

    //construct implementation of BoxWeight1
    Box1(Box1 ob1) {
        width = ob1.width;
        height = ob1.height;
        depth = ob1.depth;
    }

    //constructor used when all dimensions specified
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //constructor used when no dimensions specified
    Box1() {
        width = -1;     //use -1 to indicate
        height = -1;    //an uninitialized
        depth = -1;     //box
    }

    //constructor used when cube is created
    Box1(double len) {
        width = height = depth = len;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}