package homework_4.Radik_Manasyan.chapter_6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double returnVol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        returnVol = myBox1.returnVolume();
        System.out.println("Oбъeм равен " + returnVol);

        returnVol = myBox2.returnVolume();
        System.out.println("Oбъeм равен " + returnVol);
    }
}
