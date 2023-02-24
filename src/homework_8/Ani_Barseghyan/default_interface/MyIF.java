package homework_8.Ani_Barseghyan.default_interface;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
