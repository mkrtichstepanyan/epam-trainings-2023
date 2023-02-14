package homework_4.Zara_Avetyan.Chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;
        //ob.c=100;//Error
        ob.setc(100);
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
