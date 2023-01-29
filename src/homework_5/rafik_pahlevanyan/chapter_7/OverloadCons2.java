package homework_5.rafik_pahlevanyan.chapter_7;

public class OverloadCons2 {
    public static void main(String[] args) {

        //Create boxes using the various constructors
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycybe = new Box2(7);
        Box2 myclone = new Box2(mybox1); //create copy of mybox1
        double vol;
        vol = mybox1.volume();
        //get volume of first box
        System.out.println("Volume of mybox1 is " + vol);
        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        //get volume of cube
        vol = mycybe.volume();
        System.out.println("Volume of mycube is " + vol);
        //get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}
