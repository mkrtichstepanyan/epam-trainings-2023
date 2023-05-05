package homework_19.Radik_Manasyan.chapter15;

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"one", "two", "three", "two"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOp(MyArrayOps::countMatching, strs, "two");
        System.out.println("strs contains " + count + " twos");

    }

}
