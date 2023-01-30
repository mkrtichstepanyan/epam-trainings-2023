package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(4,5,6);
        Box mybox2 = new Box();
        Box mycube = new Box(5);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is :" + vol);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is : " + vol);
        vol = mycube.volume();
        System.out.println("Volume of mycube is : " + vol);
    }
}
