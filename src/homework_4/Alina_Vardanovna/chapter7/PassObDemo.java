package homework_4.Alina_Vardanovna.chapter7;

public class PassObDemo {

    public static void main(String[] args) {

        PassOb ob1 = new PassOb(100, 22);
        PassOb ob2 = new PassOb(100, 22);
        PassOb ob3 = new PassOb(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));

    }
}
