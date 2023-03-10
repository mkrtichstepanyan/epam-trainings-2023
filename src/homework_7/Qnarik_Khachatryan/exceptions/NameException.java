package homework_7.Qnarik_Khachatryan.exceptions;

//unchecked exception
public class NameException extends RuntimeException {

    // first implementation
//    NameException(){
//        super("Please specify correct name");
//    }

    // second implementation
    @Override
    public String toString() {
        return "Name is not correct";
    }
}
