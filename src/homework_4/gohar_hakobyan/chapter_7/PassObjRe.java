package homework_4.gohar_hakobyan.chapter_7;

public class PassObjRe {
    public static void main(String[] args) {
        TestCallByValue ob = new TestCallByValue(15, 20);

        System.out.println("ob.a and ob.b before calling " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and o.b after calling " + ob.a + " " + ob.b);
    }
}
