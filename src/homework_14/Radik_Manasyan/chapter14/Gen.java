package homework_14.Radik_Manasyan.chapter14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
