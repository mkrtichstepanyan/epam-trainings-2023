package homework_4_1.Hayk_Davtyan.chapter_7;

public class OverloadCons {
    public static void main(String [] args){
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}
