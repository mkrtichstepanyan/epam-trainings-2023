package homework_4.Inesa_Mkrtchyan.Chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.setDim(4,5,6);
        myBox2.setDim(5,6,7);
        vol = myBox1.Volume();
        System.out.println("Volume is" + vol);
        vol = myBox2.Volume();
        System.out.println("volume is" + vol);
    }

}
