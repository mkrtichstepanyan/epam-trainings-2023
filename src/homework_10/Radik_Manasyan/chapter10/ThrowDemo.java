package homework_10.Radik_Manasyan.chapter10;

public class ThrowDemo {
    static void throwDemo() {
        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехваченно в теле метода throwDemo().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            throwDemo();
        } catch (NullPointerException e) {
            System.out.println("Павторный перехват: " + e);
        }
    }
}
