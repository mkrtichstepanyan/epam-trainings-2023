package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class Factorial {
    int factn(int n){
        int result;
        if (n == 1){
            return 1;
        }else {
            result = factn(n - 1) * n;
            return result;
        }
    }
}
