package homework_8.garik_gharibyan.chapter_9.defaultt;

public interface MyIf {
    int getNumber();

    default String getString(){
        return "Default string";
    }

    static int getDefaultNumber(){
        return 0;
    }
}
