package homework_6.Hovhannes_Gspeyan.chapter_8;

public class BoxWeight2 extends Box1{
    double weight;

    BoxWeight2(BoxWeight2 ob){
        super(ob);
        this.weight = ob.weight;
    }

    public BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        this.weight = m;
    }

    public BoxWeight2() {
        super();
        this.weight = -1;
    }

    public BoxWeight2(double len, double m) {
        super(len);
        this.weight = m;
    }
}
