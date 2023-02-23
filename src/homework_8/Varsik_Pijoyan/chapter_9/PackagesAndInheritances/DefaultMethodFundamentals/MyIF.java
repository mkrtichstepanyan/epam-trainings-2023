package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.DefaultMethodFundamentals;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Default String";
    }


}
