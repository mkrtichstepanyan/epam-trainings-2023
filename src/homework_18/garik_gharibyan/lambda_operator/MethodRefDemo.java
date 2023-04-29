package homework_18.garik_gharibyan.lambda_operator;

interface StringFunc2{
    String func(String s);
}
class MyStringOps{
    static String strReverse(String s){
        String reverse = "";
        for (int i = s.length() -1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
public class MethodRefDemo {

    static String stringOp(StringFunc2 sf,String str){
        return sf.func(str);
    }
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse,inStr);
        System.out.println("Original text: " + inStr);
        System.out.println("Reverse text: " + outStr);
    }
}
