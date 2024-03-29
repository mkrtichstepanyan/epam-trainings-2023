package homework_9.Eduard_Eghiazaryan.error;

public class Error {
    private String message;
    private String fieldName;

    public Error(String message, String fieldName) {
        this.message = message;
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String toString() {
        return "Message = " + message + " field = " + fieldName + "\n";
    }
}
