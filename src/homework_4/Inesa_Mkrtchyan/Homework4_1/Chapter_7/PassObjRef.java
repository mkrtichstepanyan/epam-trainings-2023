package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println("ob.a : " + ob.a + "ob.b : " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a : " + ob.a + "ob.b : " + ob.b);
    }
}
