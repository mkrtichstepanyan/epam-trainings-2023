package homework_8.Roza_Petrosyan.Chapter_9.NestedInterface;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();

        if (nif.isNonNegative(10)) {
            System.out.println("10 is not negative");
        }
        if (nif.isNonNegative(-12)) {
            System.out.println("this won't be displayed");
        }
    }
}
