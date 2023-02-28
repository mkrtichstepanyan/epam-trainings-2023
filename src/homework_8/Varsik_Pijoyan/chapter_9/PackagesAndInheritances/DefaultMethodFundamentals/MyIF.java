package homework_8.Varsik_Pijoyan.chapter_9.PackagesAndInheritances.DefaultMethodFundamentals;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Default String";
    }


}
