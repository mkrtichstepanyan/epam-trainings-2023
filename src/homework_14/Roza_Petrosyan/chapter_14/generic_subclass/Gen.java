package homework_14.Roza_Petrosyan.chapter_14.generic_subclass;

public class Gen<T> extends NonGen{
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
