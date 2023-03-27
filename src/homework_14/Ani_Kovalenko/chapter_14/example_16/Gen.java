package homework_14.Ani_Kovalenko.chapter_14.example_16;

public class Gen<T extends Number> {

    T ob;

    Gen(T o, T[] nums) {
        ob = o;

//        Error
//
//        vals = new T[10];
//        vals = nums;
    }
}
