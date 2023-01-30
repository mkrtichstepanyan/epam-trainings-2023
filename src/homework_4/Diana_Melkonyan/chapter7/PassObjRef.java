package homework_4.Diana_Melkonyan.chapter7;

public class PassObjRef {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
