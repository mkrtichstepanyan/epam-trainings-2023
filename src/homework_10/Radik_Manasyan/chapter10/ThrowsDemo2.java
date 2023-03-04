package homework_10.Radik_Manasyan.chapter10;

public class ThrowsDemo2 {
    static void throwOne() {
        System.out.println("В теле метода throwOne().");
        throw new IllegalArgumentException("Демонстрация");
    }

    public static void main(String[] args) {
        throwOne();
    }
}
