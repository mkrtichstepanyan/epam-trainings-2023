package homework_4.gevorg_arghushyan.chapter_6;

public class BoxConstructer {
    double width;
    double height;
    double depth;

    BoxConstructer() {
        System.out.println("Constructered BoxConstructor");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return  width * height * depth;
    }
}
