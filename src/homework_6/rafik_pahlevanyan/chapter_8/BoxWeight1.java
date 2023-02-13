package homework_6.rafik_pahlevanyan.chapter_8;

//BoxWeight1 now uses super to initialize its Box1 attributes
class BoxWeight1 extends Box1 {
    double weight;  // weight of box1

    //construct clone of an object
    BoxWeight1(BoxWeight1 ob1) {    //pass object to constructor
        super(ob1);
        weight = ob1.weight;
    }

    //Initialize width, height, and depth using super()
    //constructor when all parameters are specified
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d); //call superclass constructor
        weight = m;
    }

    //default constructor
    BoxWeight1() {
        super();
        weight = -1;
    }

    //constructor used when cube is created
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}