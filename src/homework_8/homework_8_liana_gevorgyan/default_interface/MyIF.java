package homework_8.homework_8_liana_gevorgyan.default_interface;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
