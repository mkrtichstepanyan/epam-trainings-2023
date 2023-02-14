package homework_6.Gevorg_Martirosian;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    public Box(double len) {
        this.width = this.height = this.depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
