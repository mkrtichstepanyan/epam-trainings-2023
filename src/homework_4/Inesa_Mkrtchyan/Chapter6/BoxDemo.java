package homework_4.Inesa_Mkrtchyan.Chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 8;
        box.height = 10;
        box.depth = 20;

        double vol = box.depth * box.height * box.width;

        System.out.println("Volume is " + vol);

    }
}
