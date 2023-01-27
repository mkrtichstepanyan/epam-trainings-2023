package homework_4.garik_gharibyan.chapter_6;

class Box{
    double wight;
    double height;
    double depth;
}
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        double vol;

        mybox.wight = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.wight * mybox.height * mybox.depth;

        System.out.println("Value is " + vol);

    }
}
