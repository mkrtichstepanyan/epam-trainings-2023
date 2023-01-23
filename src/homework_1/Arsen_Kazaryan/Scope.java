package homework_1.Arsen_Kazaryan;

public class Scope {
    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
        }
        System.out.println("x is: " + x);
    }
}
