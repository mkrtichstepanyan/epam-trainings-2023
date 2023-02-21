package homework_4.Anna_Manukyan.chapter_6.BoxExample;

//This class declares an object of Box6 class
public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 box1 = new Box6();
        Box6 box2 = new Box6();
        double vol;

        vol = box1.volume();
        System.out.println("Volume of box 1 is " + vol);

        vol = box2.volume();
        System.out.println("Volume of box 2 is " + vol);
    }
}
