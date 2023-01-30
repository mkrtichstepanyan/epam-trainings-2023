package homework_4.Alina_Vardanovna.chapter7;

public class RetObDemo {
    public static void main(String[] args) {

        RetOb ob1 = new RetOb(2);
        RetOb ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a-ն երկրորդ անգամ մեծացնելուց հետո` " + ob2.a);

    }
}
