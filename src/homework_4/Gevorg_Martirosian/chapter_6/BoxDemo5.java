package homework_4.Gevorg_Martirosian.chapter_6;

//using a method with parameters
public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume;

        //initialising the box objects
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        //calculating the volume of myBox1
        volume = myBox1.volume();
        System.out.println("the volume is: " + volume);

        //calculating the volume of myBox2
        volume = myBox2.volume();
        System.out.println("the volume is: " + volume);
    }
}
