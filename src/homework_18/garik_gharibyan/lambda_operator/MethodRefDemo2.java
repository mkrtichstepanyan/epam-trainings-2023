package homework_18.garik_gharibyan.lambda_operator;
interface StringFunc3{
    String func(String s);
}
class MyStringOps3{
    String strReverse(String s){
        String reverse = "";
        for (int i = s.length() -1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
public class MethodRefDemo2 {
    static String stringOp(StringFunc3 sf,String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        MyStringOps3 strOps = new MyStringOps3();

        outStr = stringOp(strOps::strReverse,inStr);

        System.out.println("Original text: " + inStr);
        System.out.println("Reverse text: " + outStr);
    }
}
