package homework_8.Argishti_Mesropyan.testInterface;

public interface MyIF1 {
    int Number();

    default String getString(){
        return "Default String";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
