package homework_18.Ani_Kovalenko.chapter_15_lambda.example_10;

public class MyStringOps {

    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
