package homework_4.Ani_Kovalenko.Chapter_6;

public class BoxDemo4 {
    public static void main(String[] args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.volume4();
        System.out.println("Volume 1 equals to " + vol);
        vol = mybox2.volume4();
        System.out.println("Volume 2 equals to " + vol);
    }
}
