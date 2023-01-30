package homework_4.Armen_Martirosyan.Chapter_7;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    Box(){
        this.width=-1;
        this.height=-1;
        this.depth=-1;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
}
