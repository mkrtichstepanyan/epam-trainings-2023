package homework_4.Yeghia_Ansuryan.Chapter_7.CallByValue;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;
        System.out.println("a and b before call: " +  a + " " + b);

        ob.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}
