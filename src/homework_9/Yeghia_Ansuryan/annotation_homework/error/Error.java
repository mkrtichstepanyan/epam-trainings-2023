package homework_9.Yeghia_Ansuryan.annotation_homework.error;

public class Error {
    private String massage;
    private String fieldName;

    public Error(String massage, String fieldName) {
        this.massage = massage;
        this.fieldName = fieldName;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
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
                "massage='" + massage + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ']';
    }
}
