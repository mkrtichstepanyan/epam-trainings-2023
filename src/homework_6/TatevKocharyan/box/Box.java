package homework_6.TatevKocharyan.box;

public class Box {
    private double widht;
    private double height;
    private double depth;

    Box(Box ob) {
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;


    }

    Box(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    Box() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        widht = height = depth = len;
    }

    double volum() {
        return widht * height * depth;
    }
}