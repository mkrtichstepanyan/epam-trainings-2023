package homework_14.Radik_Manasyan.chapter14;

public class MyClass2<T, V> {
    T ob1;
    V ob2;

    MyClass2(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    boolean isSame(MyClass2<T, V> o) {
        if (ob1 == o.ob1 && ob2 == o.ob2) {
            return true;
        } else {
            return false;
        }
    }
}
