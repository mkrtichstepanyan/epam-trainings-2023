package homework_4.Alina_Vardanovna.chapter7;

public class RecursionFactorial {

    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }


}
