package homework_4.Araksya_Ghazaryan.Chapter_6;

public class Box_1 {
    double width;
    double height;
    double depth;

    Box_1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}
