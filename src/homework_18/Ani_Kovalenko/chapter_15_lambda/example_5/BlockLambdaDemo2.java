package homework_18.Ani_Kovalenko.chapter_15_lambda.example_5;

public class BlockLambdaDemo2 {

    public static void main(String[] args) {

        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));
    }
}
