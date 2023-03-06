package homework_6.gevorg_arghushyan.chapter_8;

public class BoxPrivate {
    private double width;
    private double height;
    private double depth;
    BoxPrivate(BoxPrivate ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    BoxPrivate(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    BoxPrivate(){
        width = -1;
        height = -1;
        depth = -1;
    }
    BoxPrivate(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;

    }
}
class BoxWeightPrivate extends BoxPrivate{
    double weight;
    BoxWeightPrivate(BoxWeightPrivate ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeightPrivate(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    BoxWeightPrivate(){
        super();
        weight = -1;
    }
    BoxWeightPrivate(double len, double m){
        super(len);
        weight = m;
    }
}
class DemoSuper{
    public static void main(String[] args) {
        BoxWeightPrivate myBox1 = new BoxWeightPrivate(10, 20, 15, 34.4);
        BoxWeightPrivate myBox2 = new BoxWeightPrivate(2, 3, 4, 0.076);
        BoxWeightPrivate myBox3 = new BoxWeightPrivate();
        BoxWeightPrivate myCube = new BoxWeightPrivate(3, 2);
        BoxWeightPrivate myClone = new BoxWeightPrivate(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("The volume myBox1 is equal " + vol);
        System.out.println("The weight myBox1 is equal " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("The volume myBox2 is equal " + vol);
        System.out.println("The weight myBox2 is equal " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("The volume myBox3 is equal " + vol);
        System.out.println("The weight myBox3 is equal " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("The volume myClone is equal " + vol);
        System.out.println("The weight myClone is equal " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("The volume myCube is equal " + vol);
        System.out.println("The weight myCube is equal " + myCube.weight);
        System.out.println();
    }
}

























