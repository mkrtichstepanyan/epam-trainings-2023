package homework_18.garik_gharibyan.lambda_operator;

import java.util.Locale;

interface StringFunc1 {
    String func(String s);
}

public class LambdasAsArgumentsDemo {

    static String stringOp(StringFunc1 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power of java";
        String outStr;

        System.out.println("input String is: " + inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("output String is: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println("The string whit space removed: " + outStr);

        StringFunc1 reverse = (str) -> {
            String result = "";

            for (int i = str.length() -1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("reverse input String: " + stringOp(reverse,inStr));

    }
}
