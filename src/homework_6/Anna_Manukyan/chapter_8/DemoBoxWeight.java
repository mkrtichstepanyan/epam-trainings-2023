package homework_6.Anna_Manukyan.chapter_8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.5);
        BoxWeight box2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);
        System.out.println("Weight of box1 is " + box1.weight);

        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);
        System.out.println("Weight of box2 is " + box2.weight);
    }
}
