package homework_6.gevorg_arghushyan.chapter_8;

public class Box {
    double width;
    double height;
    double depth;
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = myBox1.volume();
        System.out.println("The volume of myBox1 is equal " + vol);
        System.out.println("The weight of myBox1 is equal " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("The volume of myBox2 is equal " + vol);
        System.out.println("The weight of myBox2 is equal " + myBox2.weight);
    }
}
class ColorBox extends Box{
    int color;
    ColorBox(double w, double h, double d, int c){
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
