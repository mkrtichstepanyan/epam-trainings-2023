package homework_4.gevorg_arghushyan.chapter_6;

public class BoxParametredConstructor {
    double width;
    double height;
    double depth;
    BoxParametredConstructor(double w, double h, double d){
        width = w;
        height = h;
        depth = d;

    }
    double volume() {
        return  width * height * depth;
    }
}
