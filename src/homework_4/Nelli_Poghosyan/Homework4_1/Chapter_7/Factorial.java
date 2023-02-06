package homework_4.Nelli_Poghosyan.Homework4_1.Chapter_7;

class Factorial {
    int fact(int n){
        int result;

        if(n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
