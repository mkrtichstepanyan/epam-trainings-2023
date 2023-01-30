package homework_4.Hovhannes_Gspeyan.chapter6;

public class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    Box(){
        System.out.println("Constructing box! ");
        width = 10;
        height = 10;
        depth = 10;
    }
    void volume(){
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
    double computeVolume(){
        return width * height * depth;
    }
    void setDim(double d, double h, double w){
        depth = d;
        height = h;
        width = w;
    }
}


