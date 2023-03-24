package homework_14.garik_gharibyan.chapter_14;

interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0){
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0){
                v = vals[i];
            }
        }
        return v;
    }
}

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[] iNums = {3,6,2,8,6};
        Character[] chs = {'b','r','p','w'};

        MyClass<Integer> iob = new MyClass<>(iNums);
        System.out.println("Min value in iNums " + iob.min());
        System.out.println("Max value in iNums " + iob.max());

        MyClass<Character> chob = new MyClass<>(chs);
        System.out.println("Min value in chs " + chob.min());
        System.out.println("Max value in chs " + chob.max());

    }
}
