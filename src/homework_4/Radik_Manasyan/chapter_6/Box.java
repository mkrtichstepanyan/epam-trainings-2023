package homework_4.Radik_Manasyan.chapter_6;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Oбъeм равен ");
        System.out.println(width * height * depth);

    }

    double returnVolume(){
        return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
