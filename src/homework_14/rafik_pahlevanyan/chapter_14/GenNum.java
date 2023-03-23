package homework_14.rafik_pahlevanyan.chapter_14;

public class GenNum<T extends Number> {
    T ob;
    T[] vals;

    GenNum(T o, T[] nums) {
        ob = o;
        vals = nums;
    }

}
