package homework_4.Armen_Martirosyan.Chapter_7;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
    }
}
