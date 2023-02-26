package homework_8.Ani_Kovalenko;

public interface MyIF {
    int getNumber();
    default String getString(){
        return "Default String";
    }
}
