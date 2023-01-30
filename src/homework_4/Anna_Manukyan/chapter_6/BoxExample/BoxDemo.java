package homework_4.Anna_Manukyan.chapter_6.BoxExample;

//This class declares an object of Box class
public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        double vol;

        box.width = 10;
        box.height = 15;
        box.depth = 20;

        vol = box.depth * box.height * box.width;
        System.out.println("Volume is " + vol);
    }
}
