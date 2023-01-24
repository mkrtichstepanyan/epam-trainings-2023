package homework_4.Ani_Barseghyan.chapter_6.BoxDemo6;

public class Box {
    double width;
    double heigth;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        heigth = 10;
        depth = 10;
    }

    double volume() {
        return width * heigth * depth;
    }
}
