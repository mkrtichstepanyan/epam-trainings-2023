package homework_4.Shushanik_araqelyan.Chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 6;
        mybox1.depth = 9;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol= mybox1.volume();

        vol= mybox1.volume();

    }
}