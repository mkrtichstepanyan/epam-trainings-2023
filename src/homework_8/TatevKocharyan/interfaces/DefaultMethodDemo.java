package homework_8.TatevKocharyan.interfaces;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImpl obj = new MyIFImpl();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}