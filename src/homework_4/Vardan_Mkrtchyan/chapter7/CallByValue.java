package homework_4.Vardan_Mkrtchyan.chapter7;

public class CallByValue {
    public static void main(String[] args) {
       TestCallByValue ob = new TestCallByValue();
       int x = 10, y = 15;
        System.out.println("Before: " + x + " " + y);
        ob.meth(x,y);
        System.out.println("After: " + x + " " + y);
    }
}
class TestCallByValue{
    void meth(int i, int j){
        i *= 2;
        j *= 2;
    }
}
