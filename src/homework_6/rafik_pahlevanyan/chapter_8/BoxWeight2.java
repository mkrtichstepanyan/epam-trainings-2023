package homework_6.rafik_pahlevanyan.chapter_8;

//Add weight
//class BoxWeight2 extends Box1
class BoxWeight2 extends Box1 {
    double weight;

    //construct clone of an object
    BoxWeight2(BoxWeight2 ob2) {    //pass object to constructor
        super(ob2);
        weight = ob2.weight;
    }

    //constructor when all parameters are specified
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); //call superclass constructor
        weight = m;
    }

    //default constructor
    BoxWeight2() {
        super();
        weight = -1;
    }

    //constructor used when cube is created
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}