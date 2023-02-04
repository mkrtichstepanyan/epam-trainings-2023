package homework_4_1.Andranik_Sargsyan.chapter_7.call_by_value;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;
        System.out.println("a and b before newTest: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a and b after newTest: " + a + " " + b);
    }
}
