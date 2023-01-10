package Roza_Petrosyan;

// Demonstrate dynamic initialization.
public class DynInit {
    public static void main(String[] args){
        double a = 3.0, b = 4.0;

        // c is dynamially initialized
        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse is " + c);
    }
}