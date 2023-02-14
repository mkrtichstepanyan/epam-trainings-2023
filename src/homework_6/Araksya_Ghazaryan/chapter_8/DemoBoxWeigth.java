package homework_6.Araksya_Ghazaryan.chapter_8;

public class DemoBoxWeigth {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.76);
        double vol;

        vol = myBox1.volume();
        System.out.println(" Volume of myBox1 is: " + vol);
        System.out.println(" Volume of myBox1 is: " + myBox1.weigth);
        System.out.println();

        vol = myBox2.volume();
        System.out.println(" Volume of myBox2 is: " + vol);
        System.out.println(" Volume of myBox2 is: " + myBox2.weigth);
    }
}