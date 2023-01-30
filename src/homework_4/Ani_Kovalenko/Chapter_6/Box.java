package homework_4.Ani_Kovalenko.Chapter_6;

public class Box {
    double width;
    double height;
    double depth;

    void volume3() {
        System.out.print("Volume equals to ");
        System.out.println(width * height * depth);
    }

    double volume4() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


}
