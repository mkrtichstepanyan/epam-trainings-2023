package homework_4_1.Andranik_Sargsyan.chapter_7.box;

public class Box {
    double width;
    double height;
    double dept;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        dept = ob.dept;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        dept = d;
    }

    Box() {
        width = -1;
        height = -1;
        dept = -1;
    }

    Box(double len) {
        width = height = dept = len;
    }

    double volume() {
        return width * height * dept;
    }
}
