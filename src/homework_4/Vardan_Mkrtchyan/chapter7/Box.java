package homework_4.Vardan_Mkrtchyan.chapter7;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double len) {
        width = height = depth = len;
    }

    public Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double volume() {
        return width * height * depth;
    }

}

