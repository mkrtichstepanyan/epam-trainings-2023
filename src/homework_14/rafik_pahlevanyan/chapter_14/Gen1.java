package homework_14.rafik_pahlevanyan.chapter_14;

public class Gen1<T> extends NonGen1 {
    T ob;

    Gen1(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
