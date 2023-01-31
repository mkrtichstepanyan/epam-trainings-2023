package homework_4.Ani_Kovalenko.Chapter_7;

public class Factorial {
    int fact (int n){
        int result;
        if (n == 1){
            return 1;
        }
        result = fact(n-1)*n;
        return result;
    }
}
