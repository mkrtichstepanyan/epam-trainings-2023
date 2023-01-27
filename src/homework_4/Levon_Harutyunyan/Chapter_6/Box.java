package homework_4.Levon_Harutyunyan.Chapter_6;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    double volume1() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        System.out.println("Constructing Box ");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo {

    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is: " + vol);
    }
}
