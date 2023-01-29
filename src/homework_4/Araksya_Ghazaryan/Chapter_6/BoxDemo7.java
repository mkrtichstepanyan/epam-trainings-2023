package homework_4.Araksya_Ghazaryan.Chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {

        Box_1 mybox1 = new Box_1(10, 20, 15);
        Box_1 mybox2 = new Box_1(3, 6, 9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
