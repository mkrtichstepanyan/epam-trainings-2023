package homework_6.Araksya_Ghazaryan.chapter_8;

public class BoxWeight3 extends Box1 {
    double weight;

    BoxWeight3(BoxWeight ob){
        super(ob);
        weight = ob.weigth;
    }
    BoxWeight3(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    BoxWeight3(){
        super();
        weight = -1;
    }
    BoxWeight3(double len, double m){
        super(len);
        weight = m;
    }
}