package homework_4.Rafik_Pahlevanyan.chapter_6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //initialize each  box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
