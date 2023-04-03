package homework_14.Radik_Manasyan.chapter14;

public class GenExtendsNonGen<T> extends NonGen2 {
    T ob;

    GenExtendsNonGen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
