package homework_4.gevorg_arghushyan.chapter_6;

public class BoxConstructerDemo {
    public static void main(String[] args) {
        BoxConstructer myBox1 = new BoxConstructer();
        BoxConstructer myBox2 = new BoxConstructer();
        double vol;
        vol = myBox1.volume();
        System.out.println("The volume is " + vol);

        vol = myBox2.volume();
        System.out.println("The volume is " + vol);

    }
}
