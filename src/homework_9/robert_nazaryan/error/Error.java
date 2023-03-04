package homework_9.robert_nazaryan.error;

public class Error {
    private String message;
    private String fieldName;

    public Error(String message, String fieldName) {
        this.message = message;
        this.fieldName = fieldName;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return '[' +
                "message='" + message + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ']';
    }
}
