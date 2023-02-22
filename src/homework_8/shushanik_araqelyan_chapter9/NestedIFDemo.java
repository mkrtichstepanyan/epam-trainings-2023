package homework_8.shushanik_araqelyan_chapter9;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("this won't be displayed");
    }
}
