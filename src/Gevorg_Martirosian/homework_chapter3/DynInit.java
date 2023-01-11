//demonstration of dynamic initialisation
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        //variable c will be dynamic initialized
        double c = Math.sqrt(a * a + b * b);
        System.out.println("length of hypotenuse equals " + c);
    }
}
