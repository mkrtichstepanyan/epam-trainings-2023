package homework_8.Ofelya_Khachatryan.chapter_9.interfaces;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
