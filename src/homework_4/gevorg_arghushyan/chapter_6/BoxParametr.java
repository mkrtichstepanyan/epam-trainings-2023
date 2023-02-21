package homework_4.gevorg_arghushyan.chapter_6;

public class BoxParametr {
    double width;
    double height;
    double depth;
    double volume() {
        return width * height * depth;
    }
        void setDim(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }
    }

