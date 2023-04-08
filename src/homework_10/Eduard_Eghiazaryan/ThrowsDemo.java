package homework_10.Eduard_Eghiazaryan;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne");
        throw new IllegalArgumentException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }

    }
}


