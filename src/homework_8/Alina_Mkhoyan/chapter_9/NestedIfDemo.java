package homework_8.Alina_Mkhoyan.chapter_9;

public class NestedIfDemo {
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