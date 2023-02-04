package homework_4.Karen_Sargsyan.Chapter_7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);

        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }

}
