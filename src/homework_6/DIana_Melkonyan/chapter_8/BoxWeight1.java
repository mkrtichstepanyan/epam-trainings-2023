package homework_6.DIana_Melkonyan.chapter_8;

public class BoxWeight1 extends Box {
    double weight; // weight of box

    //constructor clone of an object
    BoxWeight1(BoxWeight1 ob) {//pass object to constructoe
        super(ob);
        weight = ob.weight;
    }

    //constructor when all parametes are specified
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
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
