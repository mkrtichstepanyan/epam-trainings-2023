package homework_4.Shushanik_araqelyan.chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test1 ob= new Test1();
        ob.a= 10;
        ob.b= 20;
        ob.setC(100);
 //  (this is not okay and will cause an error     System.out.println("a,b, and c:" + ob.a + " " + ob.b + " " + ob.getc());
    }
}
