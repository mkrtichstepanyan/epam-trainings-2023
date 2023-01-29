package homework_4.TatevKocharyan.chapter7;

public class OverloadConstructers {
    public static void main(String[] args) {
        Box mybox = new Box(10, 20, 50);
        Box mybox1 = new Box();
        Box mycube = new Box(2);
        Box myclone = new Box(mybox);
        double vol;
        vol = mybox.volume();
        System.out.println("Volume of mybox1 is " + vol);
        vol = mybox1.volume();
        System.out.println("Volume of mybox2 is " + vol);
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);

    }
}