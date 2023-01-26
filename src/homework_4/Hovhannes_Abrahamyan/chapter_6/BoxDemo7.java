package homework_4.Hovhannes_Abrahamyan.chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {
        BoxParameterized myBox1 = new BoxParameterized(1, 20, 15);
        BoxParameterized myBox2 = new BoxParameterized(3, 6, 9);
        double vol;
        vol = myBox1.volume1();
        System.out.println("Volume is " + vol);
        vol = myBox2.volume1();
        System.out.println("Volume is " + vol);
    }
}