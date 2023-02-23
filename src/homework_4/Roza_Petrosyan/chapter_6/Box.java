package homework_4.Roza_Petrosyan.chapter_6;

/* A.java program that uses a Box class.
  Call this file BoxDemo.java
  This program includes a method inside the box class
  Here Box uses a constructor to initialize the dimension of a box.
*/
class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

//    Box(double w, double h, double d){
//        this.width = w;
//        this.height = h;
//        this.depth = d;
//    }

//    Box(double width, double height, double depth){
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }

    //display volume of a box

    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    // compute a return volume
    double volume2() {
        return width * height * depth;
    }

    // set dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
