package homework_4.Anna_Manukyan.chapter_6.BoxExample;

//Here Box6 uses a constructor to initialize the dimensions of a box
public class Box6 {
    double width;
    double height;
    double depth;

    Box6(){
        System.out.println("Constructing box");
        width = 10;
        height = 20;
        depth = 15;
    }
    double volume() {
        return width * height * depth;
    }

}
