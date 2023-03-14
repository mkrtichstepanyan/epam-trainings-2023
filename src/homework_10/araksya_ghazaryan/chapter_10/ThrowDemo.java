package homework_10.araksya_ghazaryan.chapter_10;

public class ThrowDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne(). ");
        throw new IllegalAccessException("Demonstration");
    }
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException r) {
            System.out.println("Caught: " + r);
        }
    }
}