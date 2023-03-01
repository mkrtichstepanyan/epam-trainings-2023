package homework_8.gevorg_arghushyan_chapter_9;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)){
            System.out.println("10 is not negative");
        }
        if (nif.isNotNegative(-12)){
            System.out.println("This is dose not displayed");
        }
    }
}
