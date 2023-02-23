package homework_8.Hovhannes_Gspeyan.chapter_9.defaultStaticInterface;

public interface MyIf {
    int getNumber();

    default String getString(){
        return "Default String";
    }
}
