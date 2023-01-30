package homework_4.Lilit_Adamyan.chapter_7;

public class OverLoadCons2 {
    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        Box myClone = new Box(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);

        vol = myClone.volume();
        System.out.println("Volume of myClone is " + vol);
    }
}
