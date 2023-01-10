package src.Gohar_Hakobyan;

// Demonstrate block scope.
public class Scope {
    public static void main(String[] args) {
        int x = 10; // known to all code within main
        if (x == 10) {  // start new scope
            int y = 20;// known only to this block

            //x & y both known here.
            System.out.println("x և y ։ " + " " + y);
            x = y * 2;
        }
        // y = 100; error, y not known, x is still known here
        System.out.println("x հավասար է : " + x);
    }
}

