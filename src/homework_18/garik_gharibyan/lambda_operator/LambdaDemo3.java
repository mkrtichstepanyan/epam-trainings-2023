package homework_18.garik_gharibyan.lambda_operator;

interface NumericTest2{
    boolean test(int a,int b);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor;

        isFactor = (x,y) -> (x%y) == 0;

        if (isFactor.test(12,4)) System.out.println("4 is factor of 12");
        if (!isFactor.test(13,4)) System.out.println("4 is not factor of 13");
    }
}
