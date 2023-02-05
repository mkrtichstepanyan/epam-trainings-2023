package homework_5.shushanik_araqelyan.myTask.chapter7;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v)) count++;
        return count;

    }
}
