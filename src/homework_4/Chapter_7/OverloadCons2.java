package homework_4.Chapter_7;

public class OverloadCons2 {

    public static void main(String[] args) {

        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycybe = new Box2(7);
        Box2 myclone = new Box2(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycybe.volume();
        System.out.println("Volume of mycube is " + vol);

        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}
