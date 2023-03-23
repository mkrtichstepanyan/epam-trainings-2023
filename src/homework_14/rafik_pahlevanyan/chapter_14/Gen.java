package homework_14.rafik_pahlevanyan.chapter_14;

public class Gen<T> {
    T ob;   //declare an object of type T

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        System.out.println("Gen`s getOb(): ");
        return ob;
    }

    //show of type T
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }


    V getOb2() {
        return ob2;
    }
}

class Gen3<T> extends Gen<T> {
    Gen3(T o) {
        super(o);
    }

    T getOb() {
        System.out.println("Gen3`s getOb(): ");
        return ob;
    }
}

class Gen4 extends Gen<String> {
    Gen4(String o) {
        super(o);
    }

    String getOb() {
        System.out.println("You called string getOb(): ");
        return ob;
    }
}
