package homework_4.Alina_Vardanovna.chapter7;

public class PassObjReDemo {

    public static void main(String[] args) {

        PassObjRe ob = new PassObjRe(15, 20);
        System.out.println("ob.a և оb.b մինչև կանչելը: " +
                ob.a + ", " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a և оb.b կանչելուց հետո: " +
                ob.a + ", " + ob.b);
    }
}
