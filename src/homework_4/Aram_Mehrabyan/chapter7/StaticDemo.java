package homework_4.Aram_Mehrabyan.chapter7;

public class StaticDemo {
    static int a=42;
    static  int b=99;
    static void callme(){
        System.out.println("a= "+a);
    }
}
class  StaticName{
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b= "+StaticDemo.b);
    }
}
