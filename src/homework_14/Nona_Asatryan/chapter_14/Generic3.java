package homework_14.Nona_Asatryan.chapter_14;

public class Generic3<T> extends NonGeneric {
    T ob;

    Generic3(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }

}