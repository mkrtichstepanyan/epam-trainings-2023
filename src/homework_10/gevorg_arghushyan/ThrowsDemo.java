package homework_10.gevorg_arghushyan;


public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри метода throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch(IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
