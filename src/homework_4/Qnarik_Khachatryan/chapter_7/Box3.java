package homework_4.Qnarik_Khachatryan.chapter_7;

// Here Box3 allows one object to initialize another
class Box3 {
    double width;
    double height;
    double depth;

    // Notice this constructor. It takes an object of type Box3
    Box3(Box3 ob) { //pass objects to constructor
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
        width = -1; //use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box
    }

    // constructor used when cube is created
    Box3(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
