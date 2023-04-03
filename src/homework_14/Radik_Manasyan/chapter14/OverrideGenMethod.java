package homework_14.Radik_Manasyan.chapter14;

public class OverrideGenMethod<T> {
    T ob;

    OverrideGenMethod(T o) {
        ob = o;
    }

    T getOb() {
        System.out.print("Method getOb() in from class OverrideGenMethod: ");
        return ob;
    }
}
