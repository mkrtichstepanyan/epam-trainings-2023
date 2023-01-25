package homework_4.Karen_Sargsyan.Chapter_6;

public class Box6 {
    double width;
    double height;
    double depth;


    Box6() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;

    }

    double volume() {
        return width * height * depth;

    }

}
