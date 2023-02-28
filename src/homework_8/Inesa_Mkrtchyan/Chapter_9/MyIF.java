package homework_8.Inesa_Mkrtchyan.Chapter_9;

public interface MyIF {
    int getNumber();
    default String getString(){
        return "DefaultString";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
