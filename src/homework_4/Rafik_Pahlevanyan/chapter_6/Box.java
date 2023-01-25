package homework_4.Rafik_Pahlevanyan.chapter_6;

/*
A program that use the Box class.
Call this file BoxDemo.java
 */
public class Box {
    double width;
    double height;
    double depth;

    //compute and return volume
    double volume() {
        return width * height * depth;
    }

    //sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
