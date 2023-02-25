package homework_8.Anushik_Gevorgyan.Interface;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Default String";
    }

}
