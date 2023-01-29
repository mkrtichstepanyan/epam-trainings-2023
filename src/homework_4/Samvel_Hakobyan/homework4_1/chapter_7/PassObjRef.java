package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class PassObjRef {
    public static void main(String[] args) {

        Test3 ob = new Test3(15,20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b before call: " + "" + ob.a + " " + ob.b);


    }

}
