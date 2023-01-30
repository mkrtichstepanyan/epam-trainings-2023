package homework_4.Armen_Martirosyan.Chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test3 ob = new Test3();

        ob.a = 10;
        ob.b = 20;
        ob.setC(100);

        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
