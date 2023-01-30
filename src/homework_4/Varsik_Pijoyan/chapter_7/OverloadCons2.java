package homework_4.Varsik_Pijoyan.chapter_7;

import homework_4.Varsik_Pijoyan.chapter_6.Box;

public class OverloadCons2 {
    public static void main(String[] args) {
        //creating boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1.volume()); //creating copy of mybox1

        double vol;
        //getting volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        //getting volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        //getting volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        //getting volume of clone
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}
