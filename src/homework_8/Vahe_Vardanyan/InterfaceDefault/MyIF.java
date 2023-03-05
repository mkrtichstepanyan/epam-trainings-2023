package homework_8.Vahe_Vardanyan.InterfaceDefault;

public interface MyIF {
    int getNumber();

    default  String getString(){
        return "Default String";
    }
}
