package homework_4.Andranik_Sargsyan.chapter_6.box;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.weight = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.weight * myBox.height * myBox.depth;
        System.out.println("Volume is: " + vol);
    }
}
