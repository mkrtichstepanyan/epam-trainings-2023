package homework_4.Lilit_Adamyan.chaper_6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.volume1();
        System.out.println("Volume is " + vol);

        vol = myBox2.volume1();
        System.out.println("Volume is " + vol);
    }
}
