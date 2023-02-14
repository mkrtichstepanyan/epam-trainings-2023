package homework_6.Varsik_Pijoyan.chapter_8.InheritanceExampleWithBox;

public class BoxInh {
    double width;
    double height;
    double depth;



    //This constructor takes an object of type Box
    BoxInh(BoxInh ob) {  //Passing object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }


    public BoxInh(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    void SetDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Constructor used when no dimensions specified
    public BoxInh() {
        width = -1; //case -1 to indicate
        height = -1; //uninitialized
        depth = -1; //box
    }

    //Constructor used  when cube is created
    public BoxInh(double len) {
        width = height = depth = len;
    }

    //computing and returning volume
    public double volume() {
        return width * height * depth;
    }

}
