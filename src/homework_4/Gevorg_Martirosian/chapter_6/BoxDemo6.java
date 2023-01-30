package homework_4.Gevorg_Martirosian.chapter_6;

//using constructor to initialise of box object dimensions

public class BoxDemo6 {
    public static void main(String[] args) {
        //declaring, setting in memory and initialising a Box objects
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double volume;

        //calculating the volume of myBox1
        volume = myBox1.volume();
        System.out.println("the volume is: " + volume);

        //calculating the volume of myBox2
        volume = myBox2.volume();
        System.out.println("the volume is: " + volume);
    }
}
