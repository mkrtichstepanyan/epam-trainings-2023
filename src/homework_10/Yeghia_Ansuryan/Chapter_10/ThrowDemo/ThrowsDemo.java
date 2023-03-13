package homework_10.Yeghia_Ansuryan.Chapter_10.ThrowDemo;

public class ThrowsDemo {
    static void throwOne() {
        System.out.println("Inside throwOne.");
        throw new IllegalArgumentException("demo");
    }

    public static void main(String[] args) {
        throwOne();
    }
}
