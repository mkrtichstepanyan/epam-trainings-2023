package homework_4.gevorg_arghushyan.chapter_6;

public class BoxParametredConstructorDemo {
    public static void main(String[] args) {
        BoxParametredConstructor myBox1 = new BoxParametredConstructor(10, 20, 15);
        BoxParametredConstructor myBox2 = new BoxParametredConstructor(3, 6, 9);
        double vol;
        vol = myBox1.volume();
        System.out.println("The volume is " + vol);

        vol = myBox2.volume();
        System.out.println("the volume is " + vol );
    }
}
