package Vahe_Vardanyan;

public class LifeTime {
    public static void main(String[] args) {

        int x1;
        System.out.println("8/");
        for (x1 = 0; x1 < 3; x1++) {
            int y1 = -1;
            System.out.println(" The value of y equals " + y1);
            y1 = 100;
            System.out.println(" new The value of y equals " + y1);
        }
    }
}
