package homework_4.Gevorg_Martirosian.chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Access ob = new Access();

        //doing this is legal, cause a and b are public
        ob.a = 10;
        ob.b = 20;

        //this is illegal, cause there is error
        //ob.c = 100;

        //for having access to value with his methods
        ob.setc(100);       //normally
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
