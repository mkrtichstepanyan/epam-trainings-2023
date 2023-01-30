package homework_4.Andranik_Sargsyan.chapter_6.box;

public class Box {
    double weight;
    double height;
    double depth;

    Box() {
        weight = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }

    void volume() {
        System.out.print("Volume is: ");
        System.out.println(weight * height * depth);
    }

    double retVolume() {
        return weight * height * depth;
    }

    void setDim(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }
}
