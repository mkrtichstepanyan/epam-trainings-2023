package homework_8.garik_gharibyan.chapter_9;

class A {

    public interface isNestedIf {
        boolean isNonNegative(int x);
    }
}

class B implements A.isNestedIf {
    @Override
    public boolean isNonNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedIfDemo {
    public static void main(String[] args) {
        A.isNestedIf nif = new B();

        if (nif.isNonNegative(10)){
            System.out.println("10 is not negative");
        }
        if (nif.isNonNegative(-12)) {
            System.out.println("this won't be displayed");
        }
    }
}
