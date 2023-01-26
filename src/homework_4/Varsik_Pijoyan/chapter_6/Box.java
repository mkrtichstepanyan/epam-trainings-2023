package homework_4.Varsik_Pijoyan.chapter_6;

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

     Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    void SetDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
