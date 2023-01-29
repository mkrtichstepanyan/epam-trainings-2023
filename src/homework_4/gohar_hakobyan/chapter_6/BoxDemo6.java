package homework_4.gohar_hakobyan.chapter_6;

public class BoxDemo6 {
    public static void main(String[] args) {
        double vol;
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        double volume;

        volume = myBox1.volume();
        System.out.println("Volume = " + volume);

        volume = myBox2.volume();
        System.out.print("Volume = " + volume);
    }
}
