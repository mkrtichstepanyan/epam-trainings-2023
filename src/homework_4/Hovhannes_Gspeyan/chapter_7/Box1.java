package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * This class demonstrates three
 * constructors to initialize the
 * dimensions of a box various ways
 */
public class Box1 {

    double width;
    double height;
    double depth;

    Box1(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box1(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}


