package homework_18.Ani_Kovalenko.chapter_15_lambda.example_11;

import homework_18.Ani_Kovalenko.chapter_15_lambda.example_7.StringFunc;

public class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        MyStringOps strOps = new MyStringOps();

        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Original string " + inStr);
        System.out.println("String reversed " + outStr);

    }
}
