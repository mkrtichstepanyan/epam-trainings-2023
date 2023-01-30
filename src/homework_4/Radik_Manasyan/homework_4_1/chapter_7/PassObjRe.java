package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println();
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);

    }
}
