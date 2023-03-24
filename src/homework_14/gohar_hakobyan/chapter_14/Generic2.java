package homework_14.gohar_hakobyan.chapter_14;

public class Generic2<T, V> extends Generic<T> {
    V ob2;

    Generic2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}