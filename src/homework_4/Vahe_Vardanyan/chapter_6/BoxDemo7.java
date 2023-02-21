package homework_4.Vahe_Vardanyan.chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1(3, 6, 9);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
