package homework_4.Alina_Mkhoyan.chap_7;

public class PassObjRef {
    public static void main(String[] args) {
        Test3 obj = new Test3(15, 20);

        System.out.println("a and b before call: " + obj.a + " " + obj.b);

        obj.meth(obj);

        System.out.println("a and b after call: " + obj.a + " " + obj.b);
    }
}
