package homework_4.Qnarik_Khachatryan.chapter_6;

class BoxWithConstructor {
    double width;
    double height;
    double depth;

    // Constructor for BoxWithConstructor
    BoxWithConstructor() {
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
