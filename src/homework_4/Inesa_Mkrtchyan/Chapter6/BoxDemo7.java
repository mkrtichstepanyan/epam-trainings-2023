package homework_4.Inesa_Mkrtchyan.Chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box(3,6,9);
        double vol;
        vol = myBox1.Volume();
        System.out.println("Volume is " + vol);
        vol = myBox2.Volume();
        System.out.println("Volume is " + vol);
    }
}
