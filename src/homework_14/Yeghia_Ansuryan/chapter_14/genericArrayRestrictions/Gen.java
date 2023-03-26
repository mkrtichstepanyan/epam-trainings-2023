package homework_14.Yeghia_Ansuryan.chapter_14.genericArrayRestrictions;

public class Gen<T extends Number> {
    T ob;
    T[] vals;

    Gen(T o, T[] nums) {
        ob = o;
        vals = nums;
    }
}
