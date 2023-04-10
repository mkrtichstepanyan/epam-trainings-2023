package homework_8.Karen_Sargsyan.Default_Method_Demo;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Default String";
    }

}
