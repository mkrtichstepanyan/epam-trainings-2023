package homework_4.Roza_Petrosyan.chapter_7;

public class OverloadCons {
    public static void main(String[] args) {
        // create boxes using various constructors
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        // get volume of cube
        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);


    }
}
