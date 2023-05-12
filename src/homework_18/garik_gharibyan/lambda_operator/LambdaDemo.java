package homework_18.garik_gharibyan.lambda_operator;
interface MyNumber {

    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myInterface;

        myInterface = () -> 123.25;
        System.out.println(myInterface.getValue());
    }
}
