package homework_8.Samvel_Hakobyan.interfaceDefault;

public interface MyIF {
    int getNumber();

    default  String getString(){
        return "Default String";
    }
}
