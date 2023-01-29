package homework_4.Robert_Nazaryan.Chapter_7;

public class AccessTest {

        public static void main(String[] args) {
            Test5 ob = new Test5();

            ob.a = 10;
            ob.b = 20;
            ob.setC(100);
            System.out.println("a , b , c: " + ob.a + " " + ob.b + " " + ob.getC());
        }
}
