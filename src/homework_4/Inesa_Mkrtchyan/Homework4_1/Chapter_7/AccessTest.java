package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test3 ob = new Test3();
        ob.a = 10;
        ob.b = 20;
        //ob.c = 100;//Error
        ob.setc(100);
        System.out.println("a:" + ob.a + " b:" + ob.b + " c:" + ob.getc());
    }
}
