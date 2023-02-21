package homework_4.Gevorg_Martirosian.chapter_7;

public class OverloadCons2 {
    public static void main(String[] args) {
        //creating objects with using different constructors
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        Box myClone = new Box(myBox1); //creating copy of myBox1
        double vol;
        //calculate the volume of the first box
        vol = myBox1.volume();
        System.out.println("volume of myBox1: " + vol);

        //calculate the volume of the second box
        vol = myBox2.volume();
        System.out.println("volume of myBox2: " + vol);

        //calculate the volume of cube
        vol = myCube.volume();
        System.out.println("volume of myCube: " + vol);

        //calculate the volume of copy
        vol = myClone.volume();
        System.out.println("volume of myClone: " + vol);
    }
}
