package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * A.java simple example
 * of recursion
 */
public class Factorial {

    int fact(int n){
        int result;

        if(n == 1){
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}
