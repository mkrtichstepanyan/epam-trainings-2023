package homework_4.Varsik_Pijoyan.chapter_6;

public class Box {
    double width;
    double height;
    double depth;

//
//    Box() {
//        System.out.println("Constructing Box");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }

    //This constructor takes an object of type Box
    Box(Box ob) {  //Passing object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }


    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

//    double volume() {
//         return width * height * depth;
//    }
//
    void SetDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Constructor used when no dimensions specified
    public Box() {
        width = -1; //case -1 to indicate
        height = -1; //uninitialized
        depth = -1; //box
    }

    //Constructor used  when cube is created
    public Box(double len) {
        width = height = depth = len;
    }

    //computeing and returning volume
    public double volume() {
        return width * height * depth;
    }



}
