package homework_8.Anush_Ananyan;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();
        int defNum = MyIF.getDefaultNumber();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        System.out.println();

        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());

    }
}
