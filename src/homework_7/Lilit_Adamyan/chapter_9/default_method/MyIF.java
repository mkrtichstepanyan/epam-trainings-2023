package homework_7.Lilit_Adamyan.chapter_9.default_method;

public interface MyIF {
    int getNumber();
    default  String getString(){
        return "Default string";
    }
}
