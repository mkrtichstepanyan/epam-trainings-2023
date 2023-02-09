package homework_4.gevorg_arghushyan.chapter_7;

public class Test5 {
    int a;
    public int b;
    private int c;

    void setc (int i){
        c = i;
    }
    int getc (){
        return c;
    }
}
class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();
        ob.a = 10;
        ob.b = 20;
        // ob.c = 100; // Error
        ob.setc (100);
        System.out.println("a, b and c : " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
