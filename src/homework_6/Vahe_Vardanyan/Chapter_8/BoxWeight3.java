package homework_6.Vahe_Vardanyan.Chapter_8;

public class BoxWeight3 extends Box1 {
    double weight;


    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight3(double w, double h, double d, double m) {

        super(w, h, d);
        weight = m;
    }
BoxWeight3(){
    super();
    weight = -1;
}

    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}
class DemoSuper{
    public static void main(String[] args) {
        BoxWeight3 mybox1 = new BoxWeight3(10,20,15,34.3);
        BoxWeight3 mybox2 = new BoxWeight3(2,3,4,0.076);
        BoxWeight3 mybox3 = new BoxWeight3();
        BoxWeight3 mycube = new BoxWeight3(3,2);
        BoxWeight3 myclone = new BoxWeight3(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();


        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();


        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();



    }
}
