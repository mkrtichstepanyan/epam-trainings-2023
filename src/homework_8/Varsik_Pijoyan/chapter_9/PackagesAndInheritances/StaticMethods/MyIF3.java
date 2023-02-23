package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.StaticMethods;

public interface MyIF3 {
    int getNumbers();

    default String getString(){
        return "Default String";
    }

    static int getDefaultNumber(){
        return 0;
    }
}
