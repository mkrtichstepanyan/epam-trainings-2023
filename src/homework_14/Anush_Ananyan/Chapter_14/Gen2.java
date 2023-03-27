package homework_14.Anush_Ananyan.Chapter_14;

public class Gen2<T> extends NonGen2 {
    T ob;

    Gen2(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
