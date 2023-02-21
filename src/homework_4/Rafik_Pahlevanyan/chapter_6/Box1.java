package homework_4.Rafik_Pahlevanyan.chapter_6;

/*
Here, Box uses a constructor to
initialize the dimensions of a box
 */
public class Box1 {
    double width;
    double height;
    double depth;

    //This is the constructor for BOx
    Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
