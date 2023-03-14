package homework_10.anna_manukyan.exceptions;

public class ThrowsDemo {
    static void throwOne() throws IllegalArgumentException {
        System.out.println("Inside throwOne");
        throw new IllegalArgumentException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught " + e);
        }

    }
}
