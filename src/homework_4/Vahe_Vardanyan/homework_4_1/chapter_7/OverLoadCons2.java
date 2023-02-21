package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class OverLoadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box2 myclone = new Box2(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);

        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
