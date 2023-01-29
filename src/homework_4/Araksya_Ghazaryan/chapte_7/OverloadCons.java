package homework_4.Araksya_Ghazaryan.chapte_7;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is " + vol);




    }
}
