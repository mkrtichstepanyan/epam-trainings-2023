package homework_7.Diana_Melkonyan;

public class NameException extends RuntimeException{
//    NameException(){
//        super("Please correct name");
//    }

    @Override
    public String toString() {
        return "This name is not correct";
    }
}
