package homework_4.Diana_Melkonyan.chapter6;

public class Box {
    double width;
    double height;
    double depth;


    //This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    //compute and return volume

    double volume2() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


}
