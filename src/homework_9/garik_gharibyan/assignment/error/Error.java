package homework_9.garik_gharibyan.assignment.error;

public class Error {

    private final String message;

    private final String fieldName;

    public Error(String massage, String fieldName) {
        this.message = massage;
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "{" +
                message + '\'' +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}
