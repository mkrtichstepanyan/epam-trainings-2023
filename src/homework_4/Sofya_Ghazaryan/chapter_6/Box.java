package homework_4.Sofya_Ghazaryan.chapter_6;

public class Box {

    double wight;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        wight = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    void volume() {
        System.out.print("Volume is ");
        System.out.println(wight * height * depth);
    }

    double returnVolume() {
        return wight * height * depth;
    }

    void setDim(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }
}
