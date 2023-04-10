package homework_8.Karen_Sargsyan.Nested_IF_Demo;

public class NestedIfDemo {
    public static void main(String[] args) {

        A.NestedIf nif = new B();

        if (nif.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("this won't be displayed");
        }

    }

}
