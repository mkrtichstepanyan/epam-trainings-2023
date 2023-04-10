package homework_14.Radik_Manasyan.chapter14;

public class OverrideGenMethod2<T> extends OverrideGenMethod<T> {
    OverrideGenMethod2(T o) {
        super(o);
    }

    @Override
    T getOb() {
        System.out.print("Method getOb() in from class OverrideGenMethod2: ");
        return ob;
    }
}
