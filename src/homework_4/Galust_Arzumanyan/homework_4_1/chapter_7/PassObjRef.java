package homework_4.Galust_Arzumanyan.homework_4_1.chapter_7;


// This method is used to demonstrate that objects are passed through their references
class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println(" ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println(" ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}