package homework_4.Anna_Manukyan.chapter_6.BoxExample;

//This class declares an object of Box class
public class BoxDemo2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        box1.width = 10;
        box1.height = 15;
        box1.depth = 20;

        box2.width = 10;
        box2.height = 5;
        box2.depth = 53;

        vol = box1.depth * box1.height * box1.width;
        System.out.println("Volume of box 1 is " + vol);

        vol = box2.depth * box2.height * box2.width;
        System.out.println("Volume of box 2 is " + vol);
    }
}
