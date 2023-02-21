package homework_4.gevorg_arghushyan.chapter_7;

public class Test1 {
    void meth (int i, int j){
        i *= 2;
        j /= 2;
    }
}
class  CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a and b before coll: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a and b after coll: " + a + " " + b);
    }
}
