package homework_4.Gevorg_Martirosian.chapter_6;

//adding method in the Box class
public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        //setting the values to myBox1 object
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        //setting other values to myBox2 object
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        //calculate the volume of myBox1
        myBox1.volume();

        //calculate the volume of myBox2
        myBox2.volume();
    }
}
