package homework_4_1.Davit_Poghosyan.Chapter_7;

class Factorial {
    int fact(int n){
        int result;

        if(n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
