package homework_6.Liana_Gevorgyan.Chapter_8.Using_Super;

class Box1 {
    private double weight;
    private double height;
    private double depth;

    //Construct clone of an object
    Box1(Box1 ob) {
        //pass object to constructor
        weight = ob.weight;
        height = ob.height;
        depth = ob.depth;
    }

    //Constructor used when all dimensions specified
    Box1(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }

    //Constructor used when no dimensions specified
    Box1() {
        weight = -1; //use -1 to indicate
        height = -1; //uninitialized
        depth = -1; // box
    }

    //Constructor used when cube is created
    Box1(double len) {
        weight = height = depth = len;

    }

    //Compute and return volume
    double volume() {
        return weight * height * depth;
    }
}
    //BoxWeight now fully implemenents all constructors
    class BoxWeight extends Box1 {
        double weight; //weight of box

        //constructro clone of an object
        BoxWeight(BoxWeight ob) {//pass object to constructor
            super(ob);
            weight = ob.weight;
        }

        //Constructor when all parameters are specified
        BoxWeight(double w, double h, double d, double m) {
            super(w, h, d); // call superclass constructor
            weight = m;

        }

        //default constructor
        BoxWeight() {
            super();
            weight = -1;
        }

        //Constructor used when cube is created
        BoxWeight(double len, double m) {
            super(len);
            weight = m;
        }

    }


