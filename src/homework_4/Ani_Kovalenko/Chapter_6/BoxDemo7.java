package homework_4.Ani_Kovalenko.Chapter_6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box (10,20,15);
        Box mybox2 = new Box (3,6,9);
        double vol;
        vol = mybox1.volume4();
        System.out.println(vol);
        vol = mybox2.volume4();
        System.out.println(vol);
    }
}
