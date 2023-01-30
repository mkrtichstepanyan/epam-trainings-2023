package homework_4.Vladimir_Vanyan.chapter_7;

import homework_4.Roza_Petrosyan.chapter_7.Test2;

class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRef {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b afther call: " + ob.a + " " + ob.b);
    }
}
