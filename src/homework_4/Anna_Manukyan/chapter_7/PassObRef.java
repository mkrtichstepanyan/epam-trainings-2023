package homework_4.Anna_Manukyan.chapter_7;

public class PassObRef {
    public static void main(String[] args) {
        Test ob = new Test(10, 15);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.methWithObj(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
