package homework_19.Radik_Manasyan.chapter15;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda reverse to " + reverse.func("Lambda"));
        System.out.println("Expression reverse to " + reverse.func("Expression"));
    }
}
