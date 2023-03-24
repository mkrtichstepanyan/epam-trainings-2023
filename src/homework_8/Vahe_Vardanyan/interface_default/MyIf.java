package homework_8.Vahe_Vardanyan.interface_default;

public interface MyIf {
    int getNumber();

    default String getString(){
        return "Default String";
    }
}
