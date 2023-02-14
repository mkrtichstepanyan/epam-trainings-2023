package homework_6.Qnarik_Khachatryan.chapter_8.box_weight_super;

//uses super to initialize its Box attributes
//BoxWeight now fully implements all constructors
class BoxWeight extends Box {
    double weight; //weight of box

    // construct clone of an object
    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }

    // constructor used when all dimensions specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); //  call superclass constructor
        weight = m;
    }

    //default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    //constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
