package homework_4.gohar_hakobyan.chapter_7;

public class CallByValue {
    public static void main(String[] args) {
        TestCallByValue ob = new TestCallByValue(15,20);
        int a = 15, b = 20;
        System.out.println("a and b before calling " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after calling " + a + " " + b);
    }
}
