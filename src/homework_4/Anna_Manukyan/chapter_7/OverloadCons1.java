package homework_4.Anna_Manukyan.chapter_7;

public class OverloadCons1 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box();
        Box box3 = new Box(7);
        Box clone = new Box(box1);

        double vol;

        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);

        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);

        vol = box3.volume();
        System.out.println("Volume of box3 is " + vol);

        vol = clone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
