package homework_8.Diana_Melkonyan.Default;

public interface MyIF {
    //This is a normal interface method declaration.
    //It does Not define a default implemetation.
    int getNumber();

    //This is a default method. Notice that it provides
    //a default implemetation.
    default String getString(){
        return "Default String";
    }
    static int getDefaultNumber(){
        return 0;
    }

}
