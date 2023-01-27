package homework_4.Inesa_Mkrtchyan.Chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        vol = myBox1.Volume();
        System.out.println("Volume is" + vol);
        vol = myBox2.Volume();
        System.out.println("Volume is " + vol);
    }
}
