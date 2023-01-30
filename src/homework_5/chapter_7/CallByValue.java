package homework_5.chapter_7;

/**
 * test test1 class
 */
public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);

    }
}
