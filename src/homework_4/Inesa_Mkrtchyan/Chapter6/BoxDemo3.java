package homework_4.Inesa_Mkrtchyan.Chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        myBox1.width = 5;
        myBox1.height = 6;
        myBox1.depth = 8;
        myBox2.width = 15;
        myBox2.height = 22;
        myBox2.depth = 31;
        myBox1.volume();
        myBox2.volume();
    }
}
