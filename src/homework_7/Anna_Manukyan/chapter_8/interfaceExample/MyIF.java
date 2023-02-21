package homework_7.Anna_Manukyan.chapter_8.interfaceExample;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default string";
    }

    static int getDefNumber() {
        return 0;
    }
}
