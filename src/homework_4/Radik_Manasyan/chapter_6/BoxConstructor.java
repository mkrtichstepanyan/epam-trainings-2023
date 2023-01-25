package homework_4.Radik_Manasyan.chapter_6;

public class BoxConstructor {
    double width;
    double height;
    double depth;

    BoxConstructor(){
        System.out.println("Koнcтpyиpoвaниe BoxConstructor");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        return width * height * depth;
    }
}
