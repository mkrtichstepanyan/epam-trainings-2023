package homework_5.rafik_pahlevanyan.chapter_7;

//A simple example of recursion
public class Factorial {

    //this is a recursive ve method
    int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}
