package homework_4.Alina_Mkhoyan.chap_7;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;  // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box
    }
    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}
