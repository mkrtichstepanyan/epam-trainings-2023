package homework_4.Vazgen_Harutyunyan.chapter_6;

public class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    public Box(int w, int h, int d) {
    }

    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
    double volume2() {
        int w = (int) width;
        int h = (int) height;
        int d = (int) depth;

        return w * h * d;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
