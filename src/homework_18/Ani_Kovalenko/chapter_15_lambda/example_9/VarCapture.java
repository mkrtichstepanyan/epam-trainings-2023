package homework_18.Ani_Kovalenko.chapter_15_lambda.example_9;

public class VarCapture {
    public static void main(String[] args) {

        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
//            num++;   // does not allow to make changes
            return v;
        };
//        num = 9; //does not allow to make changes
    }
}
