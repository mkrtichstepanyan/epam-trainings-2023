package homework_8.Ani_Kovalenko;

public interface MyIF_2 {
    int getNumber();
    default String getString(){
        return "Default String";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
