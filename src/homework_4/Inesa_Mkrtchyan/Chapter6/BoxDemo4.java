package homework_4.Inesa_Mkrtchyan.Chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 30;
        myBox2.width = 20;
        myBox2.height = 30;
        myBox2.depth = 40;
        double vol;
        vol = myBox1.Volume();
        System.out.println("Volume is" + vol);
        vol = myBox2.Volume();
        System.out.println("Volume is" + vol);
    }
}
