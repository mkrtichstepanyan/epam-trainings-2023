package homework_8.Anna_manukyan.chapter_8.InterfaceExample;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default string";
    }

    static int getDefNumber() {
        return 0;
    }
}
