package homework_4.Samvel_Hakobyan.chapter_6;

public class Box {
    double width;
    double height;
    double depth;

    Box() {

        width = 10;
        height = 10;
        depth = 10;
        System.out.println("Constructing Box");
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    double Volume() {
        return height * depth * width;
    }

    void SetDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
}
