package homework_4.Gevorg_Martirosian.chapter_7;

//simple example of recursion
public class Factorial {
    //recursive method
    int fact(int n) {
        int result;

        if (n == 1) {
            return 1;
        }

        result = fact(n - 1) * n;
        return result;
    }
}
