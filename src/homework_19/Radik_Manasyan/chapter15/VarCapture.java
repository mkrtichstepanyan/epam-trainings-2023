package homework_19.Radik_Manasyan.chapter15;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
//          num++; //Error
            return v;
        };
//        num = 9; //Error
    }
}
