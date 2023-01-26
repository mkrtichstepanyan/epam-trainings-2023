package homework_4.Gevorg_Martirosian.chapter_6;

//creating two Box objects
public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume;

        //setting the values to myBox1 object
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        //setting other values to myBox2 object
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        //calculate the volume of myBox1
        volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("the volume of myBox1: " + volume);

        //calculate the volume of myBox2
        volume = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("the volume of myBox2: " + volume);
    }
}
