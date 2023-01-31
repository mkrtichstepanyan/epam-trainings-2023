package homework_4.Vardan_Mkrtchyan.chapter7;

class PassObjRef {
    public static void main(String[] args) {
        TestPassObjRef test = new TestPassObjRef(10, 10);
        System.out.println("Before: " + test.a + " " + test.b);
        test.meth(test);
        System.out.println("After: " + test.a + " " + test.b);
    }
}
class TestPassObjRef {
    int a, b;
    TestPassObjRef(int i, int j){
        a = i;
        b = j;
    }
    void meth(TestPassObjRef o){
        o.a *= 2;
        o.b /= 2;
    }
}
