package homework_4.Sofya_Ghazaryan.chapter_6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.wight = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.wight * myBox.height * myBox.depth;

        System.out.println("Volume is " + vol);
    }
}
