package homework_8.Radik_manasyan.chapter9;

public class NestedDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("Чиcлo 10 неотрицательное");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Этo не будет выведено");
        }
    }
}
