package homework_8.Davit_Poghosyan.Chapter_9.Interface;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Default String";
    }
    static int getDefaultNumber(){
        return 0;
        }

}
