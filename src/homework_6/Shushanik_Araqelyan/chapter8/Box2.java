package homework_6.Shushanik_Araqelyan.chapter8;

public class Box2 {
    private double width;
    private double height;
    private double depth;
    Box2(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box2(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box2( double len){
        width= height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}
