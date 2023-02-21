package homework_4.Anna_Manukyan.chapter_7;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(10, 15);
        int a = 15;
        int b = 20;

        System.out.println("a and b before call: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}
