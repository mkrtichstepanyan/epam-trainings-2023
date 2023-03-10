package homework_9.Karen_Sargsyan.annotation_homework.error;

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

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        return "[" +
                "message='" + message + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ']';
    }

}
