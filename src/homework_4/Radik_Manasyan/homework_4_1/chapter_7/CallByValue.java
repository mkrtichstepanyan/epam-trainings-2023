package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15;
        int b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);

    }
}
