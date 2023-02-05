package homework_5.shushanik_araqelyan.myTask.chapter7;

public class MetRefDemo2 {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr="Lambadas add power to Java";
        String outStr;
        MyStringOps strOps= new  MyStringOps();
        outStr=stringOp(strOps::strRevers,instr);
        System.out.println("String reversed :" + inStr);
        System.out.println("String reversed :" + outStr);
    }
}
