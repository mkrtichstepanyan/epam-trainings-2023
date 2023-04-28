package homework_8.Argishti_Mesropyan.testInterface;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default String";
    }
}
