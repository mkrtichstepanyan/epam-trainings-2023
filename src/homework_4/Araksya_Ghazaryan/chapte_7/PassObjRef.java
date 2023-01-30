package homework_4.Araksya_Ghazaryan.chapte_7;

public class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a  + " " +ob.b);

        ob.meth(ob);
        System.out.println("a and b after call: " + ob.a + " " + ob.b);
    }
}
