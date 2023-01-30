package homework_4.Araksya_Ghazaryan.chapte_7;

public class AccessTest {
    public static void main(String[] args) {
            Test1 ob = new Test1();

            ob.a = 10;
            ob.b = 20;
//          ob.c = 100   //Error! This is not ok and will cause en error

        ob.setc(100);
        System.out.println("a,b and c : " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
