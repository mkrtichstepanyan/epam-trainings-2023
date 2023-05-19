package homework_18.garik_gharibyan.lambda_operator;
interface StringFunc{
    String func(String s);
}
public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reveres;
        reveres = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i) ;
            }
            return result;
        };

        System.out.println("Lambda reversed is: " + reveres.func("Lambda"));
        System.out.println("Expression reversed is: " + reveres.func("Expression"));
    }
}
