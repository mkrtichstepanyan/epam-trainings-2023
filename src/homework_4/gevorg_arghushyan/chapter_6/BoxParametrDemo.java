package homework_4.gevorg_arghushyan.chapter_6;

public class BoxParametrDemo {
    public static void main(String[] args) {
        BoxParametr myBox1 = new BoxParametr();
        BoxParametr myBox2 = new BoxParametr();
        double vol ;
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.volume();
        System.out.println("The volume is " + vol);

        vol = myBox2.volume();
        System.out.println("The volume is " + vol);
    }
}
