package homework_2.Ani_Kovalenko;

public class OpEquals {
    public static void main(String[] args){

    int a = 1;
    int b = 2;
    int c = 3;

    a += 5;
    b *= 4;
    c += a * b;
    c %= 6;

    System.out.println("a equals to: " + a);
    System.out.println("b equals to: " + b);
    System.out.println("c equals to: " + c);
}
}
