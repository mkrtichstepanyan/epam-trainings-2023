package homework_4.Rafik_Pahlevanyan.chapter_6;

//This class declares an object of type Box.
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        //assign values to mybox`s instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        //compute volume of box
        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println("Volume is: " + vol);
    }
}
