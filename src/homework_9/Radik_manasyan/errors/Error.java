package homework_9.Radik_manasyan.errors;

public class Error {
    private String message;
    private final String fieldName;

    public Error(String message, String fieldName) {
        this.message = message;
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error " + fieldName + " { " +
                "message: " + message + '\'' +
                "}\n";
    }

}
