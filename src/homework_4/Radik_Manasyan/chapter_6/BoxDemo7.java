package homework_4.Radik_Manasyan.chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {
        BoxArgsContainer myBox1 = new BoxArgsContainer(10, 20, 15);
        BoxArgsContainer myBox2 = new BoxArgsContainer(3, 6, 9);
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм равен " + vol);

        vol = myBox2.volume();
        System.out.println("Oбъeм равен " + vol);

    }
}
