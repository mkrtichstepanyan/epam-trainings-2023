package homework_6.Hovhannes_Gspeyan.chapter_8;

/**
 * this class uses inheritance
 * to extend Box
 */
public class Box {

    public double width;
    public double height;
    public double depth;

    public Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    public Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}

/**
 * Here Box is extended to include weight
 */
class BoxWeight extends Box{
    double weight;

    public BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        this.weight = m;
    }

}
