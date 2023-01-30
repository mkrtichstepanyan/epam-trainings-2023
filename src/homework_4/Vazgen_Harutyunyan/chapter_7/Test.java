package homework_4.Vazgen_Harutyunyan.chapter_7;

public class Test {
    int a;
    public int b;
    private int c;

    void setC(int i){
        c = i;
    }
    int getC(){
        return c;
    }
}
class AccessTest{
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100);
        System.out.println("a,b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}