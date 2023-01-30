package homework_4.garik_gharibyan.chapter_7;

class Test4 {
    int a;
    public int b;
    private int c;

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

//        ob.c = 100;          error

        ob.setC(100);
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
