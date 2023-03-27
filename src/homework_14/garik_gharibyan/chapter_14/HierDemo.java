package homework_14.garik_gharibyan.chapter_14;

class Gen3<T> {
    T ob;

    Gen3(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class Gen4<T, V> extends Gen3<T> {

    V ob2;

    Gen4(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }
}

public class HierDemo {
    public static void main(String[] args) {

        Gen4<String, Integer> x = new Gen4<>("Value is: ",99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
