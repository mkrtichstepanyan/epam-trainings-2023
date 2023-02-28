package homework_8.Roza_Petrosyan.Chapter_9.Default;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImpl obj = new MyIFImpl();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        int defNum = MyIF.getDefaultNumber();
        System.out.println(defNum);
    }
}
