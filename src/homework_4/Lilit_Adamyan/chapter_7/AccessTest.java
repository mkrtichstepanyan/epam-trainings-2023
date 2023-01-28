package homework_4.Lilit_Adamyan.chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        ob.a = 10;
        ob.b= 20;


        //this is not ok and will cause an error
       // ob.c = 100;  Error!

        ob.setC(100);
        System.out.println("a,b and c : " + ob.a + " " + ob.b + " " + ob.getC());

    }
}
