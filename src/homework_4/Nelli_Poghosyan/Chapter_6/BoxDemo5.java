package homework_4.Nelli_Poghosyan.Chapter_6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        //initialize each box
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);


        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}