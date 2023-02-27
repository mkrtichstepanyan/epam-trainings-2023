package homework_8.Nona_Asatryan.chapter9.interfaceExamples;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
