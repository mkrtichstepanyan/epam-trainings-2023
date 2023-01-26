package homework_4.Anna_Manukyan.chapter_6.BoxExample;

//This class declares an object of Box class
public class BoxDemo3 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.width = 10;
        box1.height = 15;
        box1.depth = 20;

        box2.width = 10;
        box2.height = 5;
        box2.depth = 53;

        box1.volume();

        box2.volume();
    }
}
