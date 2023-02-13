package homework_6.Araksya_Ghazaryan.chapter_8;

public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob. width;
        height = ob. height;
        depth = ob. depth;
    }
    Box(double w, double h, double d){
        width = width;
        height =height;
        depth = depth;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box (double len){
        width = height = depth = len;
    }
    double volume (){
        return width * height * depth;
    }
}
