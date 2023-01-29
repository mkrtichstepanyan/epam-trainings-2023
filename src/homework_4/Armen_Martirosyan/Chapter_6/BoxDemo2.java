package homework_4.Armen_Martirosyan.Chapter_6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox3 = new Box();
        Box mybox4 = new Box();

        mybox3.width = 10;
        mybox3.height = 20;
        mybox3.depth = 15;

        mybox4.width = 3;
        mybox4.height = 6;
        mybox4.depth = 9;
        double vol;
        vol = mybox3.volume();
        System.out.println("Volume is " + vol);

        vol = mybox4.volume();
        System.out.println("Volume is " + vol);
    }
}
