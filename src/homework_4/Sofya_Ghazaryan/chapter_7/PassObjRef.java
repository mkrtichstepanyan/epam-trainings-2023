package homework_4.Sofya_Ghazaryan.chapter_7;

public class PassObjRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);

        System.out.println("ob.a and ob.b before call: "
                + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: "
                + ob.a + " " + ob.b);
    }
}
