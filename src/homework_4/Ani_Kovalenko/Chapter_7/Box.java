package homework_4.Ani_Kovalenko.Chapter_7;

public class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box (){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double length){
        width = height = depth = length;
    }
    double volume(){
        return width*height*depth;
    }
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }


}
