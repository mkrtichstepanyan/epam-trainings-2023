package homework_4.Anna_Manukyan.chapter_7;

public class AccessTest2 {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        ob.a = 10;
        ob.b = 20;
        //ob.c=30;
        ob.setC(30);
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
