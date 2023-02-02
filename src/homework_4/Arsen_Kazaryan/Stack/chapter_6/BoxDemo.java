package homework_4.Arsen_Kazaryan.Stack.chapter_6;

public class BoxDemo {

    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("The volume is " + vol);
    }
}

