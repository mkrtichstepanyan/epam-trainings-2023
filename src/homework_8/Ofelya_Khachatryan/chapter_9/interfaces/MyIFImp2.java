package homework_8.Ofelya_Khachatryan.chapter_9.interfaces;

public class MyIFImp2 implements MyIF {
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "This is a different string.";
    }
}
