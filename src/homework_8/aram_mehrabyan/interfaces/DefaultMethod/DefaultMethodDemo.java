package homework_8.aram_mehrabyan.interfaces.DefaultMethod;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFimp obj = new MyIFimp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        int defNum = MyIF.getDefaultNumber();
        System.out.println(defNum);
    }
}
