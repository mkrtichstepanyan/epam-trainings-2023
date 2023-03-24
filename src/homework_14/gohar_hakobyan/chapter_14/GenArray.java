package homework_14.gohar_hakobyan.chapter_14;

public class GenArray<T extends Number> {
    T ob;
    T vals[];

    GenArray(T o, T[] num) {
        ob = o;
        vals = num;
    }
}
