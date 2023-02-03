package homework_4.Karen_Sargsyan.Chapter_7;

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }

}
