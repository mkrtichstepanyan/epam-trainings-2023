package homework_6.Vazgen_Harutyunyan.chapter_8.fully_implement;

public class BoxS {
    private double width;
    private double height;
    private double depth;

    BoxS(BoxS ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxS(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    BoxS(){
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxS(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}

