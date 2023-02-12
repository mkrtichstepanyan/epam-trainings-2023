package homework_6.Vazgen_Harutyunyan.chapter_8.fully_implement;

public class BoxWeight extends BoxS{
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    public BoxWeight() {

    }

    public BoxWeight(double w, double h) {
    }
}
