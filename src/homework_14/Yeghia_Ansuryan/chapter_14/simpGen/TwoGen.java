package homework_14.Yeghia_Ansuryan.chapter_14.simpGen;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type of T is " +
                ob1.getClass().getName());
        System.out.println("Type of V is " +
                ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
