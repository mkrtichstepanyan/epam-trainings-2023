package homework_5.aram_mehrabyan.task1;

public class Reverse {
    public static void reverseNumber(int number) {
      int reverse;
        if(number==0)
            return;
        reverse=number%10;


        System.out.print(reverse);
        reverseNumber(number/10);
    }
}
class ReverseTest{
    public static void main(String[] args) {
        Reverse.reverseNumber(893);

    }
}
