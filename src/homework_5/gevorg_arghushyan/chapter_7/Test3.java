package homework_5.gevorg_arghushyan.chapter_7;

public class Test3 {
    int a, b;
    Test3 (int i, int j){
        a = i;
        b = j;
    }
    void meth (Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
class PassObjRef {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a and ob.b  before coll: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b  before coll: " + ob.a + " " + ob.b);
    }
}
