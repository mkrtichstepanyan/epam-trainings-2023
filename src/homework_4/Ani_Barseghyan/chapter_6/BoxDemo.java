package homework_4.Ani_Barseghyan.chapter_6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;

        System.out.printf("Volume is " + vol);
    }
}
