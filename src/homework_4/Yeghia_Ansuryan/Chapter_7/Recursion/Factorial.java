package homework_4.Yeghia_Ansuryan.Chapter_7.Recursion;

public class Factorial {
    int fact (int n) {
        int result;

        if(n == 1) return 1;
        result = fact (n-1) * n;
        return  result;
    }
}
