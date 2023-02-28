package homework_8.araksya_ghazaryan.chapter_9;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("10 in not negative");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("this won`t be displayed");
        }
    }
}
