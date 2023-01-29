package homework_4.Roza_Petrosyan.chapter_7;

public class OverloadCons2 {
    public static void main(String[] args) {
        // create boxes using various constructors

        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);

        Box2 myclone = new Box2(mybox1); // create copy of mybox1

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);

    }
}
