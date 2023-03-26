package homework_14.Yeghia_Ansuryan.chapter_14.genericSubclass;

public class Gen<T> extends NonGen {
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
