package homework_8.Diana_Melkonyan.Default;

public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        //Can call getNumber(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println(obj.getNumber());

        //Can call getNumber(), because of explicitly
        //implementation:
        System.out.println(obj.getString());

        int defNum = MyIF.getDefaultNumber();
        System.out.println(defNum);
    }
}
