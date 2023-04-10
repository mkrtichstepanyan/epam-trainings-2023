package homework_8.araksya_ghazaryan.chapter_9;

public interface MyIf {
    int getNumber();
    default String getString(){
        return "Default String";
    }
}