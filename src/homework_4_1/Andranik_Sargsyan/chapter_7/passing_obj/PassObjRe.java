package homework_4_1.Andranik_Sargsyan.chapter_7.passing_obj;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b before newTest: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after newTest: " + ob.a + " " + ob.b);

    }
}
