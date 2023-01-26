package homework_4.Nelli_Poghosyan.Chapter_6;

public class Box6 {
    double width;
    double height;
    double depth;
//constructor
    Box6(){
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    //compute and return volume
    double volume() {
        return width * height * depth;
    }

}
