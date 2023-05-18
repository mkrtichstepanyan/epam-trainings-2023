package homework_19.qnarik_khachatryan.chapter_15;

//Demonstrate a method reference to a generic method declared inside a non-generic class.

//A functional interface that operates on an array and a value, and returns an int result.

interface MyFunc2<T> {
    int func(T[] vals, T v);
}

// This class defines a method called countMatching() that returns the number of items in an array that are equal
// to a specified value. Notice that countMatching() is generic, but MyArrayOps is not.

class MyArrayOps {
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
