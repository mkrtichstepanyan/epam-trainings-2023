package homework_6.Gevorg_Martirosian;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("volume of myBox1 equals: " + vol);
        System.out.println("weight of myBox1 equals: " + myBox1.weight);

        vol = myBox2.volume();
        System.out.println("volume of myBox2 equals: " + vol);
        System.out.println("weight of myBox2 equals: " + myBox2.weight);
    }
}
