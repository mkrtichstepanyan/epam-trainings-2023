package homework_4.Vardan_Mkrtchyan.chapter7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double resylt;

        ob.test();
        //ob.test(10);
        ob.test(18, 36);
        resylt = ob.test(125.63);
        System.out.println("Result of ob.test(125.63): " + resylt);

        int i= 88;
        ob.test(i);
    }
}
