package homework_2.Ani_Kovalenko;

public class IncDec {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;
        c++;

        System.out.println("Print the value of 'a': " + a);
        System.out.println("Print the value of 'b': " + b);
        System.out.println("Print the value of 'c': " + c);
        System.out.println("Print the value of 'c': " + d);
    }
}
