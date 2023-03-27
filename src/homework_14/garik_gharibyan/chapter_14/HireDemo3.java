package homework_14.garik_gharibyan.chapter_14;
class Gen6<T> {
    T ob;

    Gen6(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.print("Gen6's getOb(): ");
        return ob;
    }
}

class Gen7<T> extends Gen6<T> {

    Gen7(T ob) {
        super(ob);
    }

    @Override
    public T getOb() {
        System.out.print("Gen7's getOb(): ");
        return ob;
    }
}

public class HireDemo3 {
    public static void main(String[] args) {
        Gen6<Integer> iOb1 = new Gen6<>(88);
        Gen7<Integer> iOb2 = new Gen7<>(99);
        Gen7<String> strOb2 = new Gen7<>("Hello");

        if (iOb2 instanceof Gen6<?>)
            System.out.println("iOb2 is instance of Gen6");
        if (iOb2 instanceof Gen7<?>)
            System.out.println("iOb2 is instance of Gen7");

        System.out.println();

        if (strOb2 instanceof Gen6<?>)
            System.out.println("strOb2 is instance of Gen6");
        if (strOb2 instanceof Gen7<?>)
            System.out.println("strOb2 is instance of Gen7");

        System.out.println();

        if (iOb1 instanceof Gen6<?>)
            System.out.println("iOb1 is instance of Gen6");
        if (iOb1 instanceof Gen7<?>)
            System.out.println("iOb1 is instance of Gen7");
    }
}
