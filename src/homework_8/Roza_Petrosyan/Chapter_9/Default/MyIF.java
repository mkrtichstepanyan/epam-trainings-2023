package homework_8.Roza_Petrosyan.Chapter_9.Default;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Default String";
    }

    static int getDefaultNumber(){
        return 0;
    }
}
