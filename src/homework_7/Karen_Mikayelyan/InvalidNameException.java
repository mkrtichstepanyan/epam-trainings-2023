package homework_7.Karen_Mikayelyan;

public class InvalidNameException extends RuntimeException {

    @Override
    public String toString() {
        return "The customer name format is not correct";
    }
}
