package gevorg_arghushyan;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x ang y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100;  Error ! Variable y is unknown here;
        System.out.println("The x value is " + x);

    }
}
