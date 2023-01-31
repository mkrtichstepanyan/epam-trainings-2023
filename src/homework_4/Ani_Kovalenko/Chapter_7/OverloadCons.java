package homework_4.Ani_Kovalenko.Chapter_7;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("mybox1 volume = " + vol);

        vol = mybox2.volume();
        System.out.println("mybox2 volume = " + vol);

        vol = mycube.volume();
        System.out.println("mycube volume = " + vol);
    }
}
