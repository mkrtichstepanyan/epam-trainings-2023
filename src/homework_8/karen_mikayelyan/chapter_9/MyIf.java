package homework_8.karen_mikayelyan.chapter_9;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Default object String";
    }

    static int getDeafaultNumber() {
        return 0;
    }
}
