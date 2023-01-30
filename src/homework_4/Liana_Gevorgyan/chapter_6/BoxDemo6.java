package homework_4.Liana_Gevorgyan.chapter_6;

public class BoxDemo6 {
    public static void main(String[] args) {
        //declare, allocate, and intialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

         //Get volume of first box
        vol = mybox1.volume2();
        System.out.println("Volume is " + vol);

        //Get volume of second box
        vol = mybox2.volume2();
        System.out.println("Volume is " + vol);
    }
}
