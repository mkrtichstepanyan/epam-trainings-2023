package homework_4.Vladimir_Vanyan.chapter_7;

class Box3 {
    double width;
    double height;
    double depth;

    // Notice this constructor. It takes an object of type Box.
    Box3(Box3 ob) {
        // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box3() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialied
        depth = -1; // box
    }

    // contstructor use when cube is crated
    Box3(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3(10, 20, 15);
        Box3 mybox2 = new Box3();
        Box3 mybox3 = new Box3(7);

        Box3 myclone = new Box3(mybox1); // create copy of mybox1

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of cube is " + vol);

        // get volume of coube
        vol = myclone.volume();
        System.out.println("Volume of cube is " + vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);

    }
}
