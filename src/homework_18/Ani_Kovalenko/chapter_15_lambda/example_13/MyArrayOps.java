package homework_18.Ani_Kovalenko.chapter_15_lambda.example_13;

public class MyArrayOps {

    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
