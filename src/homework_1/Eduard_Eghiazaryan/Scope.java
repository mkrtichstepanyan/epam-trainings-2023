package homework_1.Eduard_Eghiazaryan;

public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.printf("x and y: " + x + " " + y);
        }
        // y=100;
        System.out.printf("the value of x is " + x);
    }
}
