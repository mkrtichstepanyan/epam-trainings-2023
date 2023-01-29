package homework_4.Chapter_7;

public class PassObjRe {

    public static void main(String[] args) {

        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
