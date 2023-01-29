package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class Box2 {
    double width;
    double height;
    double depth;
    Box2(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box2(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box2(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}
