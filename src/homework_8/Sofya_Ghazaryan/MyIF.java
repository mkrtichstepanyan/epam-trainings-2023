package homework_8.Sofya_Ghazaryan;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber() {
        return 0;
    }
}