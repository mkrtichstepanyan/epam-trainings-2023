package homework_4.Vardan_Mkrtchyan.chapter7;
public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(10, 20, 15);
        Box mycube = new Box(7);

        Box myclone = new Box(mybox2);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is" +" "+vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is" +" "+vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube is" +" "+vol);

        vol = myclone.volume();
        System.out.println("Volume of myclone is" +" "+vol);

    }
}
