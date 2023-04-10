package homework_9.TatevKocharyan.chapter12.annotationsHomework.error;

public class Error {
    private String message;
    private String fieldName;

    public Error() {
    }

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

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
