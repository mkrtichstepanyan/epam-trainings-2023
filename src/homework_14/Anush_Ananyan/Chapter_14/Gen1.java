package homework_14.Anush_Ananyan.Chapter_14;

public class Gen1<T, V> extends Gen<T> {
    V ob2;

    Gen1(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}
