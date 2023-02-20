package homework_6.Armen_Martirosyan.Chapter_8;

public class BoxWeight2 extends Box1{
    double weight;

    BoxWeight2(BoxWeight2 ob){
        super(ob);
        weight=ob.weight;
    }
    BoxWeight2(double w, double h, double d, double m){
        super(w, h, d);
        weight=m;
    }

    BoxWeight2(){
        super();
        weight=-1;
    }

    public BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}
