package homework_4.Radik_Manasyan.chapter_6;

public class BoxDemo6 {
    public static void main(String[] args) {
        BoxConstructor myBox1 = new BoxConstructor();
        BoxConstructor myBox2 = new BoxConstructor();

        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм равен " + vol);

        vol = myBox2.volume();
        System.out.println("Oбъeм равен " + vol);

    }
}
