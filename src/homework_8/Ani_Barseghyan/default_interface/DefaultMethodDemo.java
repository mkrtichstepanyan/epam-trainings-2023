package homework_8.Ani_Barseghyan.default_interface;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj1 = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();
        int defNum = MyIF.getDefaultNumber();

        System.out.println(obj1.getNumber());
        System.out.println(obj1.getString());

        System.out.println(obj2.getString());
        System.out.println(obj2.getNumber());

        System.out.println(defNum);

    }
}
