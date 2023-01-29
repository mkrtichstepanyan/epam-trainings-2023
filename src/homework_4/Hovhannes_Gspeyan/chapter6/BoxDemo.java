package homework_4.Hovhannes_Gspeyan.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("Volume is " + vol);
    }
}
