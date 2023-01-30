package homework_4.Rafik_Pahlevanyan.chapter_7;

public class Box {
    double width;
    double height;
    double depth;


    //This is the constructor for Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;

    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}
