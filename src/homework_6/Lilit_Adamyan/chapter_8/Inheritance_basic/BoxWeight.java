package homework_6.Lilit_Adamyan.chapter_8.Inheritance_basic;

public class BoxWeight extends Box {
    double weight;

  /*  BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }*/

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

   public BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;

    }

    BoxWeight(double len,double m){
        super(len);
        weight = m;
    }


}
