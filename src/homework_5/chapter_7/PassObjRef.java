package homework_5.chapter_7;

/**
 * test test1 class
 */
public class PassObjRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);

    }
}
