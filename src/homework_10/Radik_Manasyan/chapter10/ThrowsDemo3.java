package homework_10.Radik_Manasyan.chapter10;

public class ThrowsDemo3 {
    static void throwOne() throws IllegalArgumentException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalArgumentException("Демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalArgumentException e) {
            System.out.println("Перехваченно исключение: " + e);
        }
    }
}
