package homework_8.Yeghia_Ansuryan.Chapter_9.DefaultMethod;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Default String";
    }
}
