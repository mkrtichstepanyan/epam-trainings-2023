package homework_8.Hovhannes_Gspeyan.defaultStaticInterface;

public interface MyIf {
    int getNumber();

    default String getString(){
        return "Default String";
    }
}
