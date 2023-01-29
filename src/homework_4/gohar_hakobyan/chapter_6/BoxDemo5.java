package homework_4.gohar_hakobyan.chapter_6;

public class BoxDemo5 {
    public static void main(String[] args) {
        BoxForDemo5 myBox1 = new BoxForDemo5();
        BoxForDemo5 myBox2 = new BoxForDemo5();
        double vol;

        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

        vol = myBox1.volume();
        System.out.println("volume = " + vol);

        vol = myBox2.volume();
        System.out.println("volume = " + vol);


    }
}
