package homework_6.Varsik_Pijoyan.chapter_8.InheritanceExampleWithBox;

public class BoxWeight extends BoxInh{
    double weight; //weight of box

    //constructor for BoxWeight
    BoxWeight(BoxWeight ob){ //passing object to constructor
        super(ob); //calling superclass constructor
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
