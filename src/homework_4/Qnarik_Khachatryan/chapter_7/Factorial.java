package homework_4.Qnarik_Khachatryan.chapter_7;

// A simple example of recursion
class Factorial {
    // this is a recursive method
    int fact(int n) {
        int result;

        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}
