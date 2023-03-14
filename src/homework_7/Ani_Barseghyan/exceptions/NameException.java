package homework_7.Ani_Barseghyan.exceptions;

public class NameException extends RuntimeException {
//    public NameException() {
//        super("Please specify correct name");
//    }

    @Override
    public String toString() {
        return "Name is not correct";
    }
}
