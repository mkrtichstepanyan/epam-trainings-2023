package homework_4.Inesa_Mkrtchyan.Chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 30;
        myBox2.width = 20;
        myBox2.height = 30;
        myBox2.depth = 40;

        vol = myBox1.depth * myBox1.width * myBox1.height;
        System.out.println("Volume of first box is:" + vol);

        vol = myBox2.depth * myBox2.width * myBox2.height;
        System.out.println("Volume of second box is:" + vol);

    }
}
