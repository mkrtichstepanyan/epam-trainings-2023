package homework_4.Robert_Nazaryan.chapter_6;

public class Box {

    double width;
    double height;
    double depth;

    void volume() {

        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    double volume2() {

        return width * height * depth;
    }

    void setDim(double w, double h,double d){

        width = w;
        height = h;
        depth = d;
    }

    Box(){
        System.out.println("Constructing Box");
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
