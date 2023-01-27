package homework_4.Nelli_Poghosyan.Chapter_6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        //initialize each box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
