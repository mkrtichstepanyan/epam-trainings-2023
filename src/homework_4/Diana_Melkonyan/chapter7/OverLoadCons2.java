package homework_4.Diana_Melkonyan.chapter7;

public class OverLoadCons2 {
    public static void main(String[] args) {
        homework_4.Diana_Melkonyan.chapter7.Box mybox1 = new homework_4.Diana_Melkonyan.chapter7.Box(10,20,15);
        homework_4.Diana_Melkonyan.chapter7.Box mybox2 = new homework_4.Diana_Melkonyan.chapter7.Box();
        homework_4.Diana_Melkonyan.chapter7.Box mycube = new homework_4.Diana_Melkonyan.chapter7.Box(7);

        homework_4.Diana_Melkonyan.chapter7.Box myclone = new homework_4.Diana_Melkonyan.chapter7.Box(mybox1);//create copy of mybox1

        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 " + vol);

        //get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);

        //get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
