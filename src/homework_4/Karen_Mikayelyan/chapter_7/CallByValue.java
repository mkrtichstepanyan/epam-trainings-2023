package homework_4.Karen_Mikayelyan.chapter_7;

public class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
