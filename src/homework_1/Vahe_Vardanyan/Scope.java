package homework_1.Vahe_Vardanyan;

public class Scope {
    public static void main(String[] args) {

        int x;

        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println(" 7/ " + " x and y " + x + " " + y);
            x = y * 2;
        }
        System.out.println(" The value of x equals " + x);
    }
}
