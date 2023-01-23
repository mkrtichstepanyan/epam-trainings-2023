package homework_4.gohar_hakobyan.chapter_6;

public class BoxDemo4 {
    public static void main(String[] args) {
        double vol;
        BoxForDemo4 myBox1 = new BoxForDemo4();
        BoxForDemo4 myBox2 = new BoxForDemo4();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.volume();
        System.out.println("volume = " + vol);

        vol = myBox2.volume();
        System.out.println("volume = " + vol);

    }
}
