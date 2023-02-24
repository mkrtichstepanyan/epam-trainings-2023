package homework_8.Vladimir_Vanyan;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Default object String";
    }

    static int getDeafaultNumber() {
        return 0;
    }
}
