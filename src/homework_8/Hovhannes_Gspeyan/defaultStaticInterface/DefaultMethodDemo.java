package homework_8.Hovhannes_Gspeyan.defaultStaticInterface;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIfImp obj = new MyIfImp();
        MyIfImp2 ob = new MyIfImp2();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        System.out.println(ob.getString());
        System.out.println(MyIfImp2.getDefaultNumber());

    }
}
