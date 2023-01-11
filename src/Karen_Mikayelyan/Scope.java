package Karen_Mikayelyan;

// Demonstrate block scope
public class Scope {
    public static void main(String[] args) {
        int x;  // known ro all code within main

        x = 10;
        if (x == 10) {
            int y = 20;

            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100;  // Error! y not known here

        // x is still known here.
        System.out.println("x is " + x);
    }

}
