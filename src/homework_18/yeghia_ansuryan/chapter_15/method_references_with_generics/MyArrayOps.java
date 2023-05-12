package homework_18.yeghia_ansuryan.chapter_15.method_references_with_generics;

public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v)
                count++;

        return count;
    }
}
