package homework_14.gohar_hakobyan.chapter_14;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type T: " + ob1);
        System.out.println("Type V: " + ob2);
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}
