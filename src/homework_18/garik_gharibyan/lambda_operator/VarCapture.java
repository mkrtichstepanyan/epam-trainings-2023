package homework_18.garik_gharibyan.lambda_operator;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
//            num = 10;         illegal
//            num++;            also illegal
            return v;
        };

        System.out.println(myLambda.func(11));
    }
}
