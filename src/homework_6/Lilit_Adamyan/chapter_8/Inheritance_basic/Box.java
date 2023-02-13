package homework_6.Lilit_Adamyan.chapter_8.Inheritance_basic;

public class Box {
    double width;
    double height;
    double depth;

    public Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
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
    double volume(){
        return width * height * depth;
    }

}
