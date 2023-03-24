package homework_14.Nona_Asatryan.chapter_14;

public class GenInt<T> extends NonGenInt {
    T ob;

    GenInt(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
