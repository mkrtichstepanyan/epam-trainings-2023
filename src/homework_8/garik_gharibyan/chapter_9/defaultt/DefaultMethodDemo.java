package homework_8.garik_gharibyan.chapter_9.defaultt;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIfImp obl = new MyIfImp();

        System.out.println(obl.getNumber());
        System.out.println(obl.getString());

        int defNum = MyIf.getDefaultNumber();
    }
}
