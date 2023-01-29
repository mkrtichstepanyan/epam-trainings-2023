package homework_4.Varsik_Pijoyan.chapter_7;

public class Factorial {
    //this is a recursive method.
    int fact(int n){
        int result;
        if (n == 1) {
            return 1;
        }
            result = fact(n-1) * n;
            return result;

    }
}
